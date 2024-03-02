package lab06;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length and breadth of the rectangle: ");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		Rectangle r= new Rectangle("Blue",true,length,breadth);
		System.out.println(r);
		
		System.out.println("Enter the length, breadth and height of the cuboid: ");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		double height=sc.nextDouble();
		Cuboid c= new Cuboid("Red",true,length,breadth,height);
		System.out.println(c);
		
		sc.close();
	}
}
