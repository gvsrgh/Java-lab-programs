package lab12;

public class T2 extends Thread {
    private int n;

    T2(int n) {
        this.n = n;
    }

    public void run() {
        MultiplicationTable m = new MultiplicationTable(n);
        m.printTable();
    }
}