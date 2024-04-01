package lab11;

import java.util.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        String text = null;
        int[] numbers = new int[5];

        try {
            // Test for NumberFormatException
            int convertedValue = Integer.parseInt("hello");  // Trying to convert a string to an integer

            // Test for NullPointerException
            System.out.println(text.length());  // Trying to access length of a null object

            // Test for ArrayIndexOutOfBoundsException
            numbers[10] = 20;  // Trying to access an element outside the array bounds
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes regardless of exceptions.");
        }
    }
}
