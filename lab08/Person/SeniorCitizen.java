package lab08;

public class SeniorCitizen extends Person {
	public SeniorCitizen(String name,int age) {
		super(name,age);
}
	public String occupation() {
		return "Retired";
	}
}