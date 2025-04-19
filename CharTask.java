package task;

// This class defines a thread that prints characters A to E
public class CharTask implements Runnable {
    @Override
    public void run() {
        // Logic to print characters from A to E
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("CharTask: " + c);
            try {
                Thread.sleep(300); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("CharTask interrupted");
            }
        }
    }
}
