package com.springcore.spring_core;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.app.bean.WishMessage;

@SuppressWarnings("deprecation")
public class App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
//		WishMessage wm = (WishMessage) factory.getBean("wm");
		WishMessage wm = factory.getBean("wm", WishMessage.class);
//		WishMessage wm2 = factory.getBean("wm", WishMessage.class);
//		System.out.println(wm.hashCode()==wm2.hashCode());
		System.out.println(wm.generateWishMessage("Samarth"));
	}
}
