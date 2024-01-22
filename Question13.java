package lab01;

import java.util.*;

public class Question13 {
	public static void main(String args[])
	{
		Scanner i = new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		int temp = i.nextInt();
		if(temp<0)
			System.out.println("Freezing Weather");
		else if(temp>=0 && temp<=10)
			System.out.println("Very Cold Weather");
		else if(temp>=11 && temp<=20)
			System.out.println("Cold Weather");
		else if(temp>=21 && temp<=30)
			System.out.println("Normal in Temp");
		else if(temp>=31 && temp<=40)
			System.out.println("It's Hot");
		else
			System.out.println("It's Very Hot");
	}
}
