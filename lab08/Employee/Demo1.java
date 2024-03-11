package lab08;

import java.util.Scanner;

public class Demo1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String name;
		int empid;
		double Salary;
		String Performance;
		System.out.println("Enter Emp name: ");
		name = in.nextLine();
		System.out.println("Enter Emp empid: ");
		empid = in.nextInt();
		System.out.println("Enter Emp Salary(In LPA): ");
		Salary = in.nextDouble();
		in.nextLine();
		System.out.println("Enter Emp Performance: ");
		Performance = in.nextLine();
		EmployeeDetails obj = new HR(name,empid,Salary,Performance);
		System.out.println("-------Employee Details-------");
		System.out.println("Common Details: ");
		obj.commonEmpDetails();
		System.out.println("Confidential Details: ");
		obj.confidentialDetails();
		System.out.println("------------------------------");
		in.close();
	}
}
