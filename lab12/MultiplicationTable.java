package lab12;

public class MultiplicationTable {
    private int n;

    MultiplicationTable(int n) {
        this.n = n;
    }

    public void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}