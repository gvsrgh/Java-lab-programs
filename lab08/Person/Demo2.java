package lab08;

import java.util.Scanner;
public class Demo2 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Person p[]=new Person[10];
		int age=0;
		String name="";
		int n;
		System.out.println("Enter number of Persons: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter name and age: ");
			name=sc.next();
			age=sc.nextInt();
			if(age<=25)
				p[i]=new Student(name,age);
			else if(age<=60)
				p[i]= new Employee(name,age);
			else
				p[i]= new SeniorCitizen(name,age);
		}
		for(int i=0;i<10;i++) {
			System.out.print(p[i].name+" : ");
			System.out.println(p[i].occupation());
		}
		sc.close();
	}
}