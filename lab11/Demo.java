package lab11;

import java.util.*;

public class Demo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		try {
			if(age<=18)
				throw new AgeException("VOTER IS NOT ELIGIBLE TO VOTE");
			else
				System.out.println("VOTER IS ELIGIBLE TO VOTE");
		}
		catch(AgeException a) {
			System.out.println(a.getMessage());
		}
	}
}
