package in.app.bean;

public class Employee {
	private Integer eno;
	private String ename;
	private Double esal;
	static {
		System.out.println("Employee class is loading...");
	}

	public Employee() {
		System.out.println("Employee Object is instantiated...");
	}

	public Employee(Integer eno, String ename, Double esal) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		System.out.println("Employee Object is instantiated with construcor injection...");
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
