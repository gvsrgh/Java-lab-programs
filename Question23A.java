package lab02;

import java.util.Scanner;

public class Question23A {
	public static void main(String args[])
	{
		System.out.println("Enter the number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int res = 0;
		int n=0;
		int check = num;
		int tnum = num;
		while(tnum>0)
		{
			n++;
			tnum/=10;
		}
		while(num>0)
		{
			tnum = num%10;
			res += Math.pow(tnum, n);
			num /= 10;
		}
		if(res==check)
			System.out.println(check+" is an Amstrong number");
		else
			System.out.println(check+" is not an Amstrong number");
		
	}
}
