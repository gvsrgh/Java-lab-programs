package lab03;
import java.util.Scanner;
public class Question33B {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions: (length, breadth, height)");
		Question3A.length = sc.nextInt();
		Question3A.breadth = sc.nextInt();
		Question3A.height = sc.nextInt();
		Question3A.volume();
	}
}
