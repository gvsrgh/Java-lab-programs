package lab05;
import java.util.Scanner;

public class Question53 {

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
            return false;
        a = a.toUpperCase();
        b = b.toUpperCase();
        int[] counta = new int[100];
        int[] countb = new int[100];
        for(int i = 0;i<a.length();i++)
        {
            counta[a.charAt(i)]++;
            countb[b.charAt(i)]++;
        }
        for(int i = 0;i<100;i++)
        {
            if(counta[i]!=countb[i])
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
