package lab06;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double length, breadth;
		
		System.out.println("Enter the length and breadth of the rectangle: ");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		Rectangle r= new Rectangle("Blue",true,length,breadth);
		System.out.println(r);
		
		System.out.println("Enter the radius of the circle: ");
		double radius=sc.nextDouble();
		Circle circle= new Circle("Green",true,radius);
		System.out.println(circle);
		
		sc.close();
	}
}
