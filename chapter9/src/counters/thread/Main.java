package counters.thread;

public class Main {
  public static void main(String[] args) {
    System.out.println("Main has started");
    CounterThread c1=new CounterThread("C1");
    CounterThread c2=new CounterThread("C2");
    c1.start();
    c2.start();
    System.out.println("Main has finished");
  }
}
