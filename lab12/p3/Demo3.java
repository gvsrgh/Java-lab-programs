package lab12;

import java.util.Scanner;

public class Demo3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char str[] = new char[5];
        System.out.println("Enter the alphabets");
        for (int i = 0; i < 5; i++) {
            str[i] = sc.next().charAt(0);
        }
        Vowel v = new Vowel(str);
        v.start();
        Consonant c = new Consonant(str);
        c.start();
        sc.close();
    }
}
