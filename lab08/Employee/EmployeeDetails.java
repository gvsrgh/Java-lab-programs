package lab08;

public abstract class EmployeeDetails {
	String name;
	int empid;
	EmployeeDetails(String name,int empid){
		this.name = name;
		this.empid = empid;
	}
	public void commonEmpDetails() {
		System.out.println("Name: "+name);
		System.out.println("Emp ID: "+empid);
	}
	public abstract void confidentialDetails();
}
