package lab04;

import java.util.Scanner;

public class Question42 {
    private double length;
    private double breadth;
    private double height;

    public boolean setLength(double length) {
        if (length > 0) {
            this.length = length;
            return true;
        }
        return false;
    }

    public boolean setBreadth(double breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
            return true;
        }
        return false;
    }

    public boolean setHeight(double height) {
        if (height > 0) {
            this.height = height;
            return true;
        }
        return false;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return length * breadth * height;
    }

    public String toString() {
        return "Length: " + getLength() + " m\nBreadth: " + getBreadth() + " m\nHeight: " + getHeight() + " m\nVolume: "
                + getVolume() + " cu.m";
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Cuboids: ");
        n = in.nextInt();
        Question42 c1[] = new Question42[n];

        for (int i = 0; i < n; i++) {
            c1[i] = new Question42();
            System.out.println("Enter the dimensions of Cuboid " + (i + 1));
            System.out.println("Enter Length: ");
            double length = in.nextDouble();
            c1[i].setLength(length);
            System.out.println("Enter Breadth: ");
            double breadth = in.nextDouble();
            c1[i].setBreadth(breadth);
            System.out.println("Enter Height: ");
            double height = in.nextDouble();
            c1[i].setHeight(height);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Cuboid " + (i + 1) + ":\n" + c1[i].toString());
        }
        in.close();
        
    }
}
