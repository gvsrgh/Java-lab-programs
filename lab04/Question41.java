package lab04;

import java.util.Scanner;

public class Question41A {
	public double length;
	public double breadth;
	public double height;
	public Question41A(double length,double breadth,double height)
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
		Question41A c1 = new Question41A(length,breadth,height);
		System.out.println("Enter the dimensions of 1st Cuboid");
		System.out.println("Enter Length: ");
		length = in.nextDouble();
		System.out.println("Enter Breadth: ");
		breadth = in.nextDouble();
		System.out.println("Enter Height: ");
		height = in.nextDouble();
		Question41A c2 = new Question41A(length,breadth,height);
		System.out.println("The volume of the cuboid is "+c1.volume());
		System.out.println("The volume of the cuboid is "+c2.volume());
		in.close();
		
	}
}
