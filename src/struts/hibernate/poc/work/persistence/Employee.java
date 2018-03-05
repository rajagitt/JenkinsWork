package struts.hibernate.poc.work.persistence;

public class Employee {

	private int empid;
	private String empname;
	private String designation;
	private Integer salary;

	public Employee() {
	}

	public Employee(int empid, String empname, String designation, Integer salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	
	
}
