package in.app.bean;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "flipkart")
@PropertySource("info.properties")
public class Flipkart {

	@Autowired
	@Qualifier("first")
	private Courier c;

	@Autowired
	private Date date;

	@Value(value = "${fkt.url}")
	private String url;

	@Value(value = "${fkt.discount}")
	private int discount;

	@Value(value = "${Path}")
	private String path;

	@Value(value = "${os.name}")
	private String os;

//	private Courier c;

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

	/*
	 * public Flipkart(Courier courier) {
	 * System.out.println("Courier object injected using construcor " +
	 * courier.getClass().getName()); this.c = courier; }
	 */

	/*
	 * @Autowired public void setC(@Qualifier("dtdc") Courier c) {
	 * System.out.println("Courier object injected using setter " +
	 * c.getClass().getName()); this.c = c; }
	 */

	public String shopping(String[] items, float[] prices) {
		float billAmt = 0.0f;
		Random random = new Random();
		int oid = random.nextInt(1000);
		for (float price : prices) {
			billAmt += price;
		}

		System.out.println("Date is " + date);
		System.out.println("Url is " + url);
		System.out.println("Discount is " + discount);
		System.out.println("Path is " + path);
		System.out.println("OS is " + os);

		String msg = c.deliver(oid);

		return Arrays.toString(items) + "are purchased having prices " + Arrays.toString(prices) + " with bill "
				+ billAmt + "--->" + msg;
	}

	@Override
	public String toString() {
		return "Flipkart [c=" + c + ", date=" + date + "]";
	}
}
