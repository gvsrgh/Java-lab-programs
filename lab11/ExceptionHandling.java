package lab11;

import java.util.*;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
        String text = null;
        int convertedValue;
        int[] numbers = new int[5];

        try {
        	do {
        		System.out.println("--------------------EXCEPTIONS--------------------");
        		System.out.println("1. Number Format Exception");
        		System.out.println("2. Null Pointer Exception");
        		System.out.println("3. Array Index Out Of Bound Exception");
        		System.out.println("4. Out of Memory Exception");
        		System.out.println("5. Input Mismatch Exception");
        		System.out.println("--------------------------------------------------");
        		System.out.println("Kindly, Select what type of Exception you want: ");
        		int n = in.nextInt();
        		if(n == 1)
        			convertedValue = Integer.parseInt("hello");
        		if(n==2)
                	System.out.println(text.length());
        		if(n==3)
        			numbers[10] = 20;
        		if(n==4)
        		{
        			int arr[] = new int[1000000000];
        		}
        		if(n==5)
        		{
        			int a = 0;
        			int b = 0;
        			boolean c = false;
        			System.out.println("Enter a,b numbers:");
        			try {
        				a = in.nextInt();
        				b = in.nextInt();
        				c = false;
        			}
        			catch(InputMismatchException e){
        				System.out.println(e);
        				c = true;
        				in.nextLine();
        				break;
        			}
        			if(c==false)
        				System.out.println("The sum is "+(a+b));
        			break;
        		}
        	}while(true);
            
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes regardless of exceptions.");
        }
        in.close();
    }
}
