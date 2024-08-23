package in.app.bean;

import java.util.Date;

public class Employee {

	private int eNo;
	private String eName;
	private Date dob;
	private Department department;

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + ", dob=" + dob + ", department=" + department + "]";
	}

}
