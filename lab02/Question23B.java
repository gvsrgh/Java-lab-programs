package lab02;

import java.util.Scanner;

public class Question23B {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<x;i++) {
			if(x%i==0) {
				sum+=i;
			}
		}
		
		if(sum==x) {
			System.out.println(x+ " is a Perfect number");
		}else {
			System.out.println(x+" is not a Perfect number");
		}
	}
}
