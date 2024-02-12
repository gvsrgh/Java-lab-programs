package lab05;

import java.util.*;

public class Question54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] token = s.trim().split("[ !,?._'@]+");
        if (s.trim().isEmpty()){
            System.out.println("0");
        } else {
            System.out.println(token.length);
            for (String t : token){
            System.out.println(t);
            } 
        scan.close();
        }
    }
}
