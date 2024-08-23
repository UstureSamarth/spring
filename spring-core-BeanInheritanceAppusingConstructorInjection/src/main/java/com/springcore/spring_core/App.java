package com.springcore.spring_core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.app.bean.*;

public class App {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		Resource resource = new ClassPathResource("applicationContext.xml");
		reader.loadBeanDefinitions(resource);

		Car c1 = factory.getBean("car1", Car.class);
		Car c2 = factory.getBean("car2", Car.class);
		System.out.println(c1);
		System.out.println(c2);
		
		

	}
}
