package lab07;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the cuboid:");
        double height = scanner.nextDouble();

        Rectangle3 rectangle = new Rectangle3("red", true, length, width);
        Cuboid cuboid = new Cuboid("blue", false, length, width, height);

        double rectangleArea = rectangle.area();
        double cuboidArea = cuboid.area();

        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Cuboid area: " + cuboidArea);

        scanner.close();
    }
}
