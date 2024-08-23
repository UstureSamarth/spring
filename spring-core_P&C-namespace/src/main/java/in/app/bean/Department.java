package in.app.bean;

import java.util.Date;

public class Department {
	private int dNo;
	private String dName;
	private Date dos;

	public Department(int dNo, String dName, Date dos) {
		super();
		this.dNo = dNo;
		this.dName = dName;
		this.dos = dos;
	}

	@Override
	public String toString() {
		return "Department [dNo=" + dNo + ", dName=" + dName + ", dos=" + dos + "]";
	}

}
