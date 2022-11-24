package thread_exec;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class InvokeAllAny {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> tasks=new LinkedList<>();
        for(int i =0;i<10;i++)
            tasks.add(()->
                new Random().nextInt(100));
        ExecutorService executor= Executors.newFixedThreadPool(5);
        List<Future<Integer>> results= executor.invokeAll(tasks);
        for (Future<Integer> x : results) {
            System.out.println(x.get());
        }
        System.out.println("=========");
        System.out.println(executor.invokeAny(tasks));
        executor.shutdown();
    }
}
