package in.app.beans;

public class CreditCard implements Ipay {

	@Override
	public boolean payBill(Double billAmount) {
		System.out.println("Paying bill using Credit Card "+billAmount);
		return true;
	}

}
