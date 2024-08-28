package in.app.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.app.cfg.AppConfig;
import in.app.comp.WishMessageGenerator;

public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator wmg = factory.getBean(WishMessageGenerator.class);
		System.out.println(wmg.generateWishMessage("Samarth"));
		factory.close();
	}
}
