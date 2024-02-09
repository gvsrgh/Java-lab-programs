package lab04;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Cuboids: ");
        n = in.nextInt();
        CuboidP c1[] = new CuboidP[n];

        for (int i = 0; i < n; i++) {
            c1[i] = new CuboidP();  
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
        System.out.println("--------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Cuboid " + (i + 1) + " Details :\n\n" + c1[i].toString());
            System.out.println("--------------------");
        }
        in.close();
    }
}
