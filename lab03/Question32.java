package lab03;
import java.util.Scanner;
public class Question32 {
    static Scanner in = new Scanner(System.in);
    public static int[][] readinput() {
        System.out.println("Enter dimensions");
        System.out.println("Enter number of rows: ");
        int m = in.nextInt();
        System.out.println("Enter number of columns: ");
        int n = in.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter " + m * n + " array elements");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                arr[i][j] = in.nextInt();
        return arr;
    }
    public static int sum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                sum += arr[i][j];
        return sum;
    }
    public static void diagonalelements(int arr[][]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i][i] + " ");
    }
    public static void print(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    public static void sumofdiagonalelements(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i][i];
        System.out.println("sum of diagonal elements is " + sum);
    }
    public static void main(String[] args) {
    	char choice;
    	int arr[][] = readinput();
    	System.out.println("-----------------Array Operations-----------------");
        System.out.println("a. Sum of all elements");
        System.out.println("b. Print the data in matrix form");
        System.out.println("c. Print the elements of principle diagonal");
        System.out.println("d. Print the Sum of elements in principle diagonal");
        System.out.println("e. Exit");
        System.out.println("--------------------------------------------------");
        do{
        	System.out.println("enter your choice:");
        	choice = in.nextString().charAt(0);
            switch (choice) {
                case 'a':
                	int s = sum(arr);
                    break;
                case 'b':
                	print(readinput());
                    break;
                case 'c':
                    diagonalelements(arr);
                    break;
                case 'd':
                    sumofdiagonalelements(arr);
                    break;
                case 'e':
                	break;
                default:
                    System.out.println("enter a valid operation");
            }
        }while(choice!='e');
        
    }
}
