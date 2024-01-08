package lab01;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units:");
		int units=sc.nextInt();
		int res;
		if(units<=50) {
			res=2*units;
			System.out.println("Bill:"+res);
		}else if(units>50 && units<=100) {
			res=3*units;
			System.out.println("Bill:"+res);
		}else if(units>100 && units<=300) {
			res=5*units+100;
			System.out.println("Bill:"+res);
		}else if(units>300 && units<=450) {
			res=6*units+200;
			System.out.println("Bill:"+res);
		}else if(units>450) {
			res=8*units+250;
			System.out.println("Bill:"+res);
		}
		
	}
}

