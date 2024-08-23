package com.springcore.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.app.bean.*;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		VoterVerifier voterVerifier = factory.getBean("voterVerifier", VoterVerifier.class);
		System.out.println(voterVerifier);
		System.out.println(voterVerifier.checkEligibility());
		factory.close();
		System.out.println("Deinstantiation of object");

	}
}
