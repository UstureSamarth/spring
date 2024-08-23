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

		EngCourse e1 = factory.getBean("in.app.bean.EngCourse#0", EngCourse.class);
		EngCourse e2 = factory.getBean("in.app.bean.EngCourse#1", EngCourse.class);
		System.out.println(e1);
		System.out.println(e2);
	}
}
