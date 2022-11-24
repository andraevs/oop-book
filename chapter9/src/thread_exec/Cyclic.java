package thread_exec;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import static thread_exec.Cyclic.NO_THREADS;

public class Cyclic {
    static final int NO_THREADS = 3;


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(NO_THREADS);
        ComplexTask task = new ComplexTask();
        for (int i = 0; i < NO_THREADS; i++)
            service.submit(() -> task.performTask());
        service.shutdown();
    }
}

class ComplexTask {

    CyclicBarrier b1 = new CyclicBarrier(NO_THREADS);
    CyclicBarrier b2 = new CyclicBarrier(NO_THREADS);

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