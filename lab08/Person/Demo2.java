package lab08;

import java.util.Scanner;
public class Demo2 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int m;
		System.out.println("Enter Number of persons: ");
		m = sc.nextInt();
		Person p[]=new Person[m];
		int age=0;
		String name="";
		for(int i=0;i<m;i++) {
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
		for(int i=0;i<m;i++) {
			System.out.print(p[i].name+" : ");
			System.out.println(p[i].occupation());
		}
		sc.close();
	}
}
