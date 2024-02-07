package lab02;

import java.util.Scanner;

public class Question21B {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First number: ");
		int x=sc.nextInt();
		System.out.println("Enter Second number: ");
		int y=sc.nextInt();
		System.out.println("Enter the operator: ");
		char op=sc.next().charAt(0);
		switch(op) {
		 case '+':
			 System.out.println(x+y);
			 break;
		 case '-':
			 System.out.println(x-y);
			 break;
		 case '*':
			 System.out.println(x*y);
			 break;
		 case '/':
			 System.out.println(x/y);
			 break;
		 default:
			 System.out.println("Enter valid character");
			 break;
			 		
		}
	}
}
