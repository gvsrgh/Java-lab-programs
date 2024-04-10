package lab12;

public class T1 extends Thread {
    private int n;

    public T1(int n) {
        this.n = n;
    }

    public void run() {
        MultiplicationTable m = new MultiplicationTable(n);
        m.printTable();
    }
}