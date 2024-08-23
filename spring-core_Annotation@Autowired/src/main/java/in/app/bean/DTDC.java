package in.app.bean;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC class is loading...");
	}

	public DTDC(){
		System.out.println("DTDC object is instantiated...");
	}

	@Override
	public String deliver(int oid) {
		return "DTDC will deliver order with order id "+oid;
	}

}
