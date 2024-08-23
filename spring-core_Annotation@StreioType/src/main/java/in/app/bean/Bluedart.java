package in.app.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "bdart")
@Scope(value = "prototype")
public class Bluedart implements Courier {
	
	static {
		System.out.println("Bluedart class is loading...");
	}
	
	public Bluedart(){
		System.out.println("Bluedart object is instantiated...");
	}

	@Override
	public String deliver(int oid) {
		return "Bluedart will deliver order with order id "+oid;
	}

}
