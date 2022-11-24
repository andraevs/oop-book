package producer_consumer_2;


import java.util.Random;

public class Producer extends Thread{
  private SharedRes sharedRes;

  public Producer(String name, SharedRes sharedRes) {
    super(name);
    this.sharedRes = sharedRes;
  }

  public void run(){
    Random ran = new Random();
    while(true){

      Integer i = ran.nextInt(100);
      sharedRes.produce(i);
      System.out.println(getName() +" added "+i);
    }
  }
}
