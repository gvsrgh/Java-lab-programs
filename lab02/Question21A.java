package lab02;

import java.util.Scanner;

public class Question21A {

	public static void main(String[] args) {
		System.out.println("Enter your choice: ");
		Scanner in = new Scanner(System.in);
		String choice = in.next();
		char fChoice;
		fChoice = choice.toLowerCase().charAt(0);
		switch(fChoice)
		{
		case 'a':
			System.out.println("Ada");
			break;
		case 'c':
			System.out.println("C language");
			break;
		case 'f':
			System.out.println("Fortan");
			break;
		case 'j':
			System.out.println("Java");
			break;
		case 'p':
			System.out.println("Python");
			break;
		case 'v':
			System.out.println("Visual C++");
			break;
		default:
			System.out.println("Invalid Character");
		}
		
	}

}
