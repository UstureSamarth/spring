package in.app.bean;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier c;

	static {
		System.out.println("Flipkart class is loading ...");
	}

	public Flipkart() {
		System.out.println("Flipkart object is instantiated ...");
	}

	public Flipkart(Courier courier) {
		System.out.println("Courier object injected using construcor " + courier.getClass().getName());
		this.c = courier;
	}

	public void setC(Courier c) {
		System.out.println("Courier object injected using setter and Object is " + c.getClass().getName());
		this.c = c;
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
