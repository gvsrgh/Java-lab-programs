package lab05;
import java.util.*;

public class Question51 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String revA="";
        for(int i = A.length()-1;i>=0;i--)
            revA+=A.charAt(i);
        if(A.equals(revA))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}



