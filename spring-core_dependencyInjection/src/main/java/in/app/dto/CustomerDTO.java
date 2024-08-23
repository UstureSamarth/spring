package in.app.dto;

public class CustomerDTO {
	private String cName;
	private String cAddress;
	private Double principleAmt;
	private Double noOfYears;
	private Double rateOfInterest;

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

	public Double getPrincipleAmt() {
		return principleAmt;
	}

	public void setPrincipleAmt(Double principleAmt) {
		this.principleAmt = principleAmt;
	}

	public Double getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(Double noOfYears) {
		this.noOfYears = noOfYears;
	}

	public Double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	public String toString() {
		return "CustomerDTO [cName=" + cName + ", cAddress=" + cAddress + ", principleAmt=" + principleAmt
				+ ", noOfYears=" + noOfYears + ", rateOfInterest=" + rateOfInterest + "]";
	}

}
