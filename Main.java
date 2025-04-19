//Name: Ron Mathew Jobi
//PRN: 23070126109
//Batch: AIML B2
import runner.ThreadRunner;

// Main class to run the application
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting Thread Demo ===");

        // Create a ThreadRunner object to start threads
        ThreadRunner runner = new ThreadRunner();
        runner.startAllThreads();

        System.out.println("=== Main Thread Finished Launching Other Threads ===");
    }
}
