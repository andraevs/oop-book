package thread_exec;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cyclic {
    static final int NO_THREADS = 5;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(NO_THREADS);
        ComplexTask task = new ComplexTask();
        for (int i = 0; i < NO_THREADS; i++)
            service.submit(() -> task.performTask());
        service.shutdown();
    }
}

class ComplexTask {
    CyclicBarrier b1 = new CyclicBarrier(3);
    CyclicBarrier b2 = new CyclicBarrier(3);

    public void performTask() {

        try {
            System.out.println("Task 1");
            b1.await();
            System.out.println("Task 2");
            b2.await();
            System.out.println("Task 3");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}