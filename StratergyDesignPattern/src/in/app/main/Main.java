package in.app.main;

import in.app.beans.CreditCard;
import in.app.beans.DebitCard;
import in.app.beans.PaymentProcessing;

public class Main {
	public static void main(String[] args) {

		PaymentProcessing p = new PaymentProcessing(new CreditCard());
		if (p.doPayment(120.9)) {
			System.out.println("Credit Card Payment Success");
		} else {
			System.out.println("Credit Card Payment failure");
		}

		p = new PaymentProcessing(new DebitCard());
		if (p.doPayment(129.9)) {
			System.out.println("Debit Card Payment Success");
		} else {
			System.out.println("Debit Card Payment failure");
		}

	}
}
