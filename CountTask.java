package task;

// This class defines a thread that counts from 1 to 5 with delay
public class CountTask implements Runnable {
    @Override
    public void run() {
        // Logic to count numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("CountTask: " + i);
            try {
                Thread.sleep(500); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("CountTask interrupted");
            }
        }
    }
}
