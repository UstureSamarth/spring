package in.app.beans;

public class PaymentProcessing {
	private Ipay pay = null;

	public PaymentProcessing() {

	}

	public PaymentProcessing(Ipay pay) {
		this.pay = pay;
	}

	public boolean doPayment(Double billamount) {
		return pay.payBill(billamount);
	}
}
