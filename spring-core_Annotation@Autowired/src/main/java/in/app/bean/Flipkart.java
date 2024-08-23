package in.app.bean;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("courier") private Courier c;
	 */

	private Courier c;

	static {
		System.out.println("Flipkart class is loading ...");
	}

	public Flipkart() {
		System.out.println("Flipkart object is instantiated ...");
	}

	/*
	 * @Autowired public Flipkart(@Qualifier("bdart") Courier courier) {
	 * System.out.println("Courier object injected using construcor " +
	 * courier.getClass().getName()); this.c = courier; }
	 */
	
	public Flipkart(Courier courier) {
		System.out.println("Courier object injected using construcor " + courier.getClass().getName());
		this.c = courier;
	}

	@Autowired
	public void setC(@Qualifier("dtdc")  Courier c) {
		System.out.println("Courier object injected using setter " + c.getClass().getName());
		this.c = c;
	}

	@Override
	public String toString() {
		return "Flipkart [c=" + c + "]";
	}

	public String shopping(String[] items, float[] prices) {
		float billAmt = 0.0f;
		Random random = new Random();
		int oid = random.nextInt(1000);
		for (float price : prices) {
			billAmt += price;
		}
		String msg = c.deliver(oid);

		return Arrays.toString(items) + "are purchased having prices " + Arrays.toString(prices) + " with bill "
				+ billAmt + "--->" + msg;
	}
}
