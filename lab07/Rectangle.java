package lab07;

import java.util.Scanner;

public class Rectangle {
    public static Scanner in = new Scanner(System.in);
    public double length, breadth;

    public Rectangle() {
        length = 0;
        breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double length) {
        this.length = length;
        this.breadth = length;
    }

    public double area() {
        return this.length * this.breadth;
    }

    public static double area(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        double length, breadth;
        System.out.println("Enter Dimensions of Rectangle");
        System.out.println("Enter length: ");
        length = in.nextDouble();
        System.out.println("Enter breadth: ");
        breadth = in.nextDouble();

        Rectangle rect1 = new Rectangle(length, breadth);
        System.out.println("Enter length for Rectangle: ");
        length = in.nextDouble();
        Rectangle rect2 = new Rectangle(length);
        
        Rectangle rect3 = new Rectangle();
        
        System.out.println("Area of the Rectangle with two parameters: " + rect1.area());
        System.out.println("Area of the Rectangle with one parameter: " + rect2.area());
        System.out.println("Area of the Rectangle with zero parameters: " + rect3.area());
    }
}
