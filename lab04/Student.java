package lab04;

import java.util.Scanner;

public class Student {
    private static final Scanner in = new Scanner(System.in);
    private String name;
    private long ID;
    private char gender;
    private String department;

    public void setName(String name) {
        if (name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            System.out.println("Invalid Name!!");
        }
    }

    public void setID(long ID) {
        if (String.valueOf(ID).length() == 10) {
            this.ID = ID;
        } else {
            System.out.println("Invalid ID!!");
        }
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Invalid Gender!!");
        }
    }

    public void setDepartment(String department) {
        if (department.matches("CE|CSE|ECE|EEE|MECH|IT|MBA")) {
            this.department = department;
        } else {
            System.out.println("Invalid Department");
        }
    }
    
    public String toString() {
        return "ID: " + ID + "\nName: " + name + "\nGender: " + gender + "\nDepartment: " + department;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Enter Student 1 details: ");
        System.out.println("Enter your name: ");
        s1.setName(in.nextLine());
        System.out.println("Enter your Roll Number: ");
        s1.setID(Long.parseLong(in.nextLine()));
        System.out.println("Enter your Gender(M/F): ");
        s1.setGender(in.nextLine().charAt(0));
        System.out.println("Enter your Department: ");
        s1.setDepartment(in.nextLine());
        
        Student s2 = new Student();
        System.out.println("Enter Student 2 details: ");
        System.out.println("Enter your name: ");
        s2.setName(in.nextLine());
        System.out.println("Enter your Roll Number: ");
        s2.setID(Long.parseLong(in.nextLine()));
        System.out.println("Enter your Gender(M/F): ");
        s2.setGender(in.nextLine().charAt(0));
        System.out.println("Enter your Department: ");
        s2.setDepartment(in.nextLine());

        System.out.println("Student 1 Details: \n" + s1);
        System.out.println();
        System.out.println("Student 2 Details: \n" + s2);

        in.close();
    }
}
