package lab13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuboid> list = new ArrayList<Cuboid>();
        while (true) {
            System.out.println("******MENU******");
            System.out.println("1. Add new Cuboid");
            System.out.println("2. Display");
            System.out.println("3. Sort by length");
            System.out.println("4. Sort by volume");
            System.out.println("5. Terminate");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    list.add(new Cuboid(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                    break;
                case 2:
                    for (Cuboid c : list) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    Collections.sort(list, new SortByLength());
                    for (Cuboid c : list) {
                        System.out.println(c);
                    }
                    break;
                case 4:
                    Collections.sort(list, new SortByVolume());
                    for (Cuboid c : list) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter a valid choice");
                sc.close();
            }
        }
    }
}
