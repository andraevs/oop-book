package producer_consumer_1;

import java.util.LinkedList;
import java.util.Queue;

public class SharedRes {
  private Queue<Integer> queue= new LinkedList<>();
  private int limit;

  public SharedRes(int limit) {
    this.limit = limit;
  }

  public synchronized void produce(Integer i){
    while(queue.size() == limit) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    notify();
    queue.add(i);
  }

  public synchronized Integer remove(){
    while(queue.isEmpty()) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    notify();
    return queue.remove();
  }
}
