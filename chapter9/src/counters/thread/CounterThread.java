package counters.thread;

public class CounterThread extends Thread{

  public CounterThread(String name) {
    super(name);
//    setDaemon(true);
  }

  @Override
  public void run(){
    System.out.println("Thread "+getName()+ " has started");
    for(int i=0;i<3;i++){
      System.out.println("Thread "+getName()+" is at step "+i);
      try {
        sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Thread "+getName()+ " has finished");
  }
}
