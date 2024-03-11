package lab08;

public class Employee extends Person{
	public Employee(String name,int age) {
		super(name,age);
	}
	public String occupation() {
		return "Working";
	}
}