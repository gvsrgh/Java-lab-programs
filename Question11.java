package lab01;

import java.util.Scanner;

public class Question11 {
	public static void main(String args[])
	{
		Scanner i = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String name = i.nextLine();
		System.out.print("\nEnter your Roll Number: ");
		String roll = i.nextLine();
		System.out.print("\nEnter your Gender: ");
		char gender = i.nextLine().charAt(0);
		System.out.print("\nEnter your Department: ");
		String dept = i.next();
		System.out.print("\nEnter your Grade: ");
		float grade = i.nextFloat();
		
		System.out.println("\n----------------------Student Details----------------------");
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+roll);
		System.out.println("Gender: "+gender);
		System.out.println("Department: "+dept);
		System.out.println("Grade: "+grade);
		
		
	}
}
