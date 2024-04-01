package lab11;

import java.util.*;

public class InputMissMatch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		boolean c = false;
		do
		{
			System.out.println("Enter a,b numbers:");
			try {
				a = in.nextInt();
				b = in.nextInt();
				c = false;
			}
			catch(InputMismatchException e){
				System.out.println(e);
				c = true;
				in.nextLine();
			}
		}while(c);
		System.out.println("The sum is "+(a+b));
		in.close();
		
	}

}
