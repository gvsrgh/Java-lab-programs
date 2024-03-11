package lab08;

public class HR extends EmployeeDetails {
	double Salary;
	String Performance;
	HR(String name,int empid,double Salary,String Performance){
		super(name,empid);
		this.Salary = Salary;
		this.Performance = Performance;
	}
	public void confidentialDetails() {
		System.out.println("Salary(In LPA): "+Salary);
		System.out.println("Performance: "+Performance);
	}
}
