package com.springcore.spring_core;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.app.bean.Employee;

@SuppressWarnings("deprecation")
public class App {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = factory.getBean("emp", Employee.class);
		System.out.println(emp);
	}
}
