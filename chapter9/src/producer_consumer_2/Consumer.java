package producer_consumer_2;


public class Consumer extends Thread{
  private SharedRes sharedRes;

  public Consumer(String name, SharedRes sharedRes) {
    super(name);
    this.sharedRes = sharedRes;
  }

  public void run(){
    while(true){
      Integer i = sharedRes.remove();
      System.out.println(getName() +" removed "+i);
    }
  }
}
