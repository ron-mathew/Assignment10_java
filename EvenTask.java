package task;

// This class defines a thread that prints even numbers from 2 to 10
public class EvenTask implements Runnable {
    @Override
    public void run() {
        // Logic to print even numbers from 2 to 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("EvenTask: " + i);
            try {
                Thread.sleep(400); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("EvenTask interrupted");
            }
        }
    }
}
