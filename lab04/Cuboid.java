package lab04;

import java.util.Scanner;

public class Cuboid {
	public double length;
	public double breadth;
	public double height;
	public Cuboid(double length,double breadth,double height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public double volume()
	{
		return length*breadth*height;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the dimensions of 1st Cuboid");
		System.out.println("Enter Length: ");
		double length = in.nextDouble();
		System.out.println("Enter Breadth: ");
		double breadth = in.nextDouble();
		System.out.println("Enter Height: ");
		double height = in.nextDouble();
		Cuboid c1 = new Cuboid(length,breadth,height);
		System.out.println("Enter the dimensions of 2nd Cuboid");
		System.out.println("Enter Length: ");
		length = in.nextDouble();
		System.out.println("Enter Breadth: ");
		breadth = in.nextDouble();
		System.out.println("Enter Height: ");
		height = in.nextDouble();
		Cuboid c2 = new Cuboid(length,breadth,height);
		System.out.println("The volume of the 1st cuboid is "+c1.volume());
		System.out.println("The volume of the 2nd cuboid is "+c2.volume());
		in.close();
		
	}
}
