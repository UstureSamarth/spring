package in.app.common;

import java.util.Date;

public class PersonInfo {
	private Long pNo;
	private String pName;

	private Date dob;
	private Date doj;
	private Date dom;

	public PersonInfo(Long pNo, String pName, Date dob, Date doj, Date dom) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonInfo [pNo=" + pNo + ", pName=" + pName + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}

}
