package lab06;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle: ");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		Rectangle c= new Rectangle("Red",true,length,breadth);
		System.out.println(c);
		sc.close();
	}
}