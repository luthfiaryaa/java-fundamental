package essential.java.classes.concurrency.synchronization;

public class MsLunch {
    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void inc1() {
        synchronized (lock1) {
            c1++;
            System.out.println(c1);
        }
    }

    public void inc2() {
        synchronized (lock2) {
            c2++;
            System.out.println(c2);
        }
    }

    public static void main(String[] args) {
        MsLunch mslunch = new MsLunch();
        mslunch.inc1();
        mslunch.inc2();
    }
}
