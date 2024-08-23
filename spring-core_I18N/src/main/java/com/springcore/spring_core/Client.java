package com.springcore.spring_core;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Locale l1 = new Locale("hi", "IN");
		String cap1 = context.getMessage("btn1.cap", new String[] { "student" }, l1);
		String cap2 = context.getMessage("btn2.cap", null, l1);
		String cap3 = context.getMessage("btn3.cap", null, l1);
		String cap4 = context.getMessage("btn4.cap", null, l1);
		System.out.println(cap1);
		System.out.println(cap2);
		System.out.println(cap3);
		System.out.println(cap4);
		context.close();
	}
}
