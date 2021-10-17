package interrupting;

import static java.lang.Thread.sleep;

public class MainInterrupt {
  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(){
      public void run(){
        while (isInterrupted() == false){
          System.out.println("Thread is at step 1");
          System.out.println("Thread is at step 2");
          System.out.println("Thread is at step 3");
          try {
            sleep(500);
          } catch (InterruptedException e) {
            System.out.println("Interrupt while blocked");
            break;
          }
        }
      }
    };
    t.start();
    sleep(200);
    t.interrupt();
  }
}
