package lab03;
import java.util.Scanner;
public class Question33A {
	public static double length,breadth,height;
	public static void volume() {
		System.out.println("Volume:"+(length*breadth*height));
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions: (length, breadth, height)");
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		volume();
		
	}
}
