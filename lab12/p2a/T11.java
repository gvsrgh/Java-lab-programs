package lab12;

public class T11 extends Thread {
    private int n;

    public T11(int n) {
        this.n = n;
    }

    public void run() {
        MultiplicationTable1 m = new MultiplicationTable1(n);
        m.printTable();
    }
}
