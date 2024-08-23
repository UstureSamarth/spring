package in.app.bean;

import org.springframework.stereotype.Component;

@Component(value = "ff")
public class Firstflight implements Courier {

	static {
		System.out.println("Firstflight class is loading...");
	}

	public Firstflight() {
		System.out.println("Firstflight object is instantiated...");
	}

	@Override
	public String deliver(int oid) {
		return "Firstflight will deliver order with order id "+oid;
	}

}
