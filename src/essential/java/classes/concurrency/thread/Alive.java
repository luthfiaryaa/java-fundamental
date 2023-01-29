package essential.java.classes.concurrency.thread;

public class Alive extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Alive thread = new Alive();
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Alive: " + amount);
        amount++;
        System.out.println("Alive: " + amount);
    }
    public void run() {
        amount++;
    }
}
