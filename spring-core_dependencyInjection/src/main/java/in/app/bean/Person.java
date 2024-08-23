package in.app.bean;

public class Person {
	private Integer pid;
	private String pname;
	private String paddress;
	private Double psal;
	static {
		System.out.println("Person class is loading...");
	}

	public Person() {
		System.out.println("Person Object is instantiated...");
	}

	public Person(Integer pid, String pname, String paddress, Double psal) {
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.psal = psal;
		System.out.println("Person Object is instantiated with constructor injection");
	}

	public Person(Integer pid, String pname) {
		this.pid = pid;
		this.pname = pname;
		System.out.println("Person Object is instantiated with two param constructor injection");
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
		System.out.println("pid is injected");
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
		System.out.println("pname is injected");
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
		System.out.println("paddress is injected");
	}

	public Double getPsal() {
		return psal;
	}

	public void setPsal(Double psal) {
		this.psal = psal;
		System.out.println("psal is injected");
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", psal=" + psal + "]";
	}

}
