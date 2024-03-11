package lab08;

public class Student extends Person {
	public Student(String name,int age) {
		super(name,age);
	}

	public String occupation() {
		return "Studying";
	}
}