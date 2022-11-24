package thread_exec;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor= Executors.newSingleThreadExecutor();
        executor.submit(()-> System.out.println("hello"));
        Future<Integer> res=executor.submit(()-> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 3+5;
        });
        executor.shutdown();
        System.out.println(res.get(50, TimeUnit.MILLISECONDS));
    }
}
