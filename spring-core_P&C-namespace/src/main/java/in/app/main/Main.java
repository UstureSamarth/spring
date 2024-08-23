package in.app.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.app.bean.Employee;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee=factory.getBean("employee",Employee.class);
		System.out.println(employee);
		
		factory.close();

	}
}
