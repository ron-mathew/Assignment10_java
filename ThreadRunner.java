package runner;

import task.CountTask;
import task.EvenTask;
import task.CharTask;

// This class manages the creation and starting of multiple threads
public class ThreadRunner {

    // This method starts all the threads
    public void startAllThreads() {
        Thread t1 = new Thread(new CountTask());
        Thread t2 = new Thread(new EvenTask());
        Thread t3 = new Thread(new CharTask());

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
