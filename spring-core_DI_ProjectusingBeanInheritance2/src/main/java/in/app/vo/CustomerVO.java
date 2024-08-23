package in.app.vo;

public class CustomerVO {
	private String cName;
	private String cAddress;
	private String principleAmt;
	private String noOfYears;
	private String rateOfInterest;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getPrincipleAmt() {
		return principleAmt;
	}

	public void setPrincipleAmt(String principleAmt) {
		this.principleAmt = principleAmt;
	}

	public String getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(String noOfYears) {
		this.noOfYears = noOfYears;
	}

	public String getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	public String toString() {
		return "CustomerVO [cName=" + cName + ", cAddress=" + cAddress + ", principleAmt=" + principleAmt
				+ ", noOfYears=" + noOfYears + ", rateOfInterest=" + rateOfInterest + "]";
	}

}
