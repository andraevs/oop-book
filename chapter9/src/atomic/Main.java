package atomic;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for(int i=0;i<1000;i++) {
                Order o = new Order();
                System.out.println(o);

            }
        };
        for(int i=0;i<50;i++){
            Thread t = new Thread(r);
            t.start();
        }
        Thread.sleep(2000);
        System.out.println(Order.atomicInteger.get());
    }
}
