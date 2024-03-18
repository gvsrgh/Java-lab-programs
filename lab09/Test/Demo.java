import Test.Foundation;
    public class Demo {
    public static void main(String[] args) {
        Test.Foundation foundation = new Test.Foundation();
        System.out.println("Accessing var2 (public): " + foundation.var2);
        /*
       	System.out.println("Accessing var1 (private): " + foundation.var1);
       	System.out.println("Accessing var3 (default): " + foundation.var3);
       	System.out.println("Accessing var4 (protected): " + foundation.var4);
       	*/
    }
}

