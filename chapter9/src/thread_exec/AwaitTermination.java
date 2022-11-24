package thread_exec;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class AwaitTermination {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor= Executors.newSingleThreadExecutor();
        for(int i=0;i<10000;i++)
            executor.submit(()->{
                long sum=0;
                for(int j=0;j<30000;j++)
                    sum+=j;
            });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MILLISECONDS);
        if(executor.isTerminated())
            System.out.println("Tasks finished");
        else
            System.out.println("Tasks still running");
            }
}
