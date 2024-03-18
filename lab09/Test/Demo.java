package lab09;
import Test.Foundation;

public class Demo {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
        foundation.var1 = 10;
        foundation.var2 = 20;   
        foundation.var3 = 30;    
        foundation.var4 = 40;
        System.out.println("var1: "+ foundation.var1);    
        System.out.println("var2: " + foundation.var2);
        System.out.println("var3: " + foundation.var3);
        System.out.println("var4: " + foundation.var4);
    }
}

