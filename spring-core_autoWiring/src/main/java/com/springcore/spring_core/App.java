package com.springcore.spring_core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.app.bean.Flipkart;

public class App {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		Resource resource = new ClassPathResource("applicationContext.xml");
		reader.loadBeanDefinitions(resource);

		Flipkart flipkart = factory.getBean("flipkart", Flipkart.class);
		String msg = flipkart.shopping(new String[] { "A", "B", "C" }, new float[] { 1.2f, 2.4f, 3.4f });

		System.out.println("<---------------->");
		System.out.println(msg);
	}
}
