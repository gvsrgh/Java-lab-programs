package lab12;

public class MultiplicationTable1 {
    private int n;

    MultiplicationTable1(int n) {
        this.n = n;
    }

    public void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
