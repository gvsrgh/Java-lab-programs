package lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) throws FileNotFoundException {

        File fout = new File("/home/pllab/eclipse-workspace/JavaProject557/src/lab13/HelloWorld.java");
        Scanner input = new Scanner(fout);
        HashSet<Character> c = new HashSet<>();
        c.add('A');
        c.add('E');
        c.add('I');
        c.add('O');
        c.add('U');
        int vowels = 0, consonants = 0;
        while (input.hasNext()) {
            String s = input.nextLine();
            s = s.toUpperCase();
            for (int i = 0; i < s.length(); i++) {
                if (c.contains(s.charAt(i))) {
                    vowels++;
                } else {
                    if (Character.isAlphabetic(s.charAt(i))) {
                        consonants++;
                    }
                }
            }
        }
        System.out.println("Vowel count: " + vowels);
        System.out.println("Consonant count: " + consonants);
        input.close();
    }
}
