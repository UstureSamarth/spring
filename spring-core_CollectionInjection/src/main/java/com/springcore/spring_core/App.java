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
		MarkInfo markInfo = factory.getBean("marksinfo", MarkInfo.class);
		College college = factory.getBean("college", College.class);
		ContactInfo info = factory.getBean("contactinfo", ContactInfo.class);
		UniversityInfo uInfo = factory.getBean("universityInfo", UniversityInfo.class);
		System.out.println(markInfo);
		System.out.println(college);
		System.out.println(info);
		System.out.println(uInfo);

	}
}
