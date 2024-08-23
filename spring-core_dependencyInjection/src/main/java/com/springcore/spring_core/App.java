package com.springcore.spring_core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.app.bean.Person;

public class App {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		Resource resource = new ClassPathResource("applicationContext.xml");
		reader.loadBeanDefinitions(resource);

		Person person1 = factory.getBean("person1", Person.class);
		Person person2 = factory.getBean("person2", Person.class);
		Person person3 = factory.getBean("person3", Person.class);
		System.out.println(person1 + "\n" + person2);
		System.out.println(person3);
		
	}
}
