package in.app.cfg;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.app")
public class AppConfig {
	static {
		System.out.println("AppConfig class is loaded...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	@Bean("dt")
	public LocalDateTime getSysDateTime() {
		System.out.println("AppConfig.getSysDateTime()");
		return LocalDateTime.now();
	}

	@Bean("list")
	public List<String> getList() {
		List<String> l = new ArrayList<String>();
		l.add("ABC");
		l.add("PQR");
		l.add("XYZ");
		return l;
	}
}
