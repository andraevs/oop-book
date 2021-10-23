package sensors;

import producer_consumer_1.SharedRes;

public class Dispatcher extends Thread{
  private EventQueue sharedRes;

  public Dispatcher(String name, EventQueue sharedRes) {
    super(name);
    this.sharedRes = sharedRes;
  }

  public void run(){
    while(true){
      SensorEvent s = sharedRes.remove();
      System.out.println(getName() +" removed "+s);
      try {
        sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}