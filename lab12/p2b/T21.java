package lab12;

public class T21 extends Thread {
    private int n;

    public T21(int n) {
        this.n = n;
    }

    public void run() {
        MultiplicationTable1 m = new MultiplicationTable1(n);
        m.printTable();
    }
}
