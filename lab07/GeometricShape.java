package lab07;

import java.util.Scanner;

public class GeometricShape {
	public static Scanner in = new Scanner(System.in);
	public static double area(double length,double breadth) {
		return length*breadth;
	}
	public static double area(double length,double breadth,double height) {
		return length*breadth*height;
	}
	public static void main(String args[]) {
		double length,breadth,height;
		System.out.println("Enter Dimensions of Rectangle");
		System.out.println("Enter length: ");
		length = in.nextDouble();
		System.out.println("Enter breadth: ");
		breadth = in.nextDouble();
		System.out.println("Enter the Dimensions of Cuboid");
		System.out.println("Enter length: ");
		length = in.nextDouble();
		System.out.println("Enter breadth: ");
		breadth = in.nextDouble();
		System.out.println("Enter height: ");
		height = in.nextDouble();
		System.out.println("Area of the Rectangle is "+area(length,breadth));
		System.out.println("Area of Cuboid is "+area(length,breadth,height));
		
	}
}
