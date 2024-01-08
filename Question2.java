package lab01;

import java.util.Scanner;

public class Question2 {
	public static void main(String args[])
	{
		Scanner i = new Scanner(System.in);
		System.out.println("Enter your bill: ");
		float bill = i.nextFloat();
		System.out.println("Enter tip Percentage: ");
		float tip = i.nextFloat();
		System.out.println("Enter tax Precentage: ");
		float tax = i.nextFloat();
		
		float finalBill;
		finalBill = bill + (bill*(tip/100)) + (bill*(tax/100));
		
		System.out.println("------------------Bill Details------------------");
		System.out.println("Cost of meal: "+bill);
		System.out.println("Tip: "+tip);
		System.out.println("Tax: "+tax);
		System.out.println("Final Price: "+finalBill);
	}
}
