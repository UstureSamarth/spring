package in.app.beans;

public class DebitCard implements Ipay {

	@Override
	public boolean payBill(Double billAmount) {
		System.out.println("Paying bill using Debit Card " + billAmount);
		return true;
	}

}
