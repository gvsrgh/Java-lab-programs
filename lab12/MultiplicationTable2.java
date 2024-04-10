package lab12;

public class MultiplicationTable2 {
    private int n;

    MultiplicationTable2(int n) {
        this.n = n;
    }

    synchronized public void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + 	i + " = " + n * i);
        }
    }
}