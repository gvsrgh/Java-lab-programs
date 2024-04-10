package lab12;

import java.util.Scanner;

public class Demo2b {
    public static void main(String args[]) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        T12 t1 = new T12(n1);
        T22 t2 = new T22(n2);
        t1.start();
        t2.start();
        sc.close();
    }
}