package sensors;

import java.util.LinkedList;
import java.util.Queue;

public class EventQueue {
  private Queue<SensorEvent> queue= new LinkedList<>();
  private int limit;

  public EventQueue(int limit) {
    this.limit = limit;
  }

  public synchronized void produce(SensorEvent i){
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

  public synchronized SensorEvent remove(){
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
