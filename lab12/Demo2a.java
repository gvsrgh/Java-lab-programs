package lab12;

import java.util.Scanner;

public class Demo2a {
    public static void main(String args[]) {
        System.out.println("Enter the numbers:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        T1 t1 = new T1(n1);
        T2 t2 = new T2(n2);

        t1.start();
        t2.start();
        sc.close();
    }
}