package in.app.vo;

public class EmployeeVO {

	private Integer eid;
	private String eName;
	private String eage;
	private String eaddress;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEage() {
		return eage;
	}

	public void setEage(String eage) {
		this.eage = eage;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "EmployeeVO [eid=" + eid + ", eName=" + eName + ", eage=" + eage + ", eaddress=" + eaddress + "]";
	}

}
