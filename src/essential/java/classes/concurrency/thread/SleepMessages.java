package essential.java.classes.concurrency.thread;

public class SleepMessages {
    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat iv too"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e){
                return;
            }

            System.out.println(importantInfo[i]);
        }
    }
}
