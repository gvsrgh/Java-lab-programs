package lab12;

public class T12 extends Thread {
    private int n;

    T12(int n) {
        this.n = n;
    }

    public void run() {
        MultiplicationTable2 m = new MultiplicationTable2(n);
        m.printTable();
    }
}
