package counters.runnable;

public class Main {
  public static void main(String[] args) {
    System.out.println("Main has started");
    Runnable r = () -> {
      String name = Thread.currentThread().getName();
      System.out.println("Thread "+name+ " has started");
      for(int i=0;i<3;i++){
        System.out.println("Thread "+name+" is at step "+i);
        try {
          Thread.sleep(50);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("Thread "+name+ " has finished");
    };

    Thread c1 = new Thread(r);
    Thread c2 = new Thread(r);
    c1.setName("C1");
    c2.setName("C2");
    c1.start();
    c2.start();
    System.out.println("Main has finished");
  }
}
