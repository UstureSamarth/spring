package com.springcore.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.app.bean.Flipkart;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

		Flipkart flipkart = factory.getBean("flipkart", Flipkart.class);
		String msg = flipkart.shopping(new String[] { "A", "B", "C" }, new float[] { 1.2f, 2.4f, 3.4f });

		System.out.println("<---------------->");
		System.out.println(msg);
		
		
	}
}
