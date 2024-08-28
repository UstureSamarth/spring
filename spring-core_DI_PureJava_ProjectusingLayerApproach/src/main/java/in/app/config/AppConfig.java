package in.app.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "in.app")
@PropertySource("application.properties")
public class AppConfig {

	@Autowired
	private Environment env;

	static {
		System.out.println("AppConfig class is loaded...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	@Bean("hikaridatasource")
	public DataSource getDataSource() {
		HikariDataSource datasource = new HikariDataSource();
		datasource.setDriverClassName(env.getProperty("jdbc.driver"));
		datasource.setJdbcUrl(env.getProperty("jdbc.url"));
		datasource.setUsername(env.getProperty("jdbc.user"));
		datasource.setPassword(env.getProperty("jdbc.password"));
		datasource.setMaximumPoolSize(Integer.parseInt(env.getProperty("hikari.maxPoolSize")));
		datasource.setMinimumIdle(Integer.parseInt(env.getProperty("hikari.minIdle")));
		datasource.setConnectionTimeout(Integer.parseInt(env.getProperty("hikari.connectionTimeout")));
		return datasource;
	}

}
