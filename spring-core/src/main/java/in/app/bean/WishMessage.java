package in.app.bean;

import java.util.Date;

public class WishMessage {
	private Date date;
	static {
		System.out.println("WishMessage class is loading...");
	}

	public WishMessage() {
		System.out.println("WishMessage Object is instantiated...");
	}

	public WishMessage(Date date) {
		System.out.println("WishMessage Object is instantiated with constructor injection " + date);
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("WishMessage is setting date with setter injection " + date);
		this.date = date;
	}

	@SuppressWarnings("deprecation")
	public String generateWishMessage(String name) {

		System.out.println("Date is " + date);
		if (date.getHours() <= 12) {
			return "Hello " + name + " Good Morning";
		} else if (date.getHours() <= 16) {
			return "Hello " + name + " Good AfterNoon";
		} else if (date.getHours() <= 20) {
			return "Hello " + name + " Good Evening";
		} else {
			return "Hello " + name + " Good Night";

		}

	}

}
