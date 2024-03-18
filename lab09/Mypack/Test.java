package Mypack;

import pack.Student;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student ID:");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Enter student name:");
        String name = in.nextLine();
        System.out.println("Enter student email:");
        String email = in.nextLine();
        Student s = new Student(id, name, email);
        s.display();
        in.close();
    }
}

