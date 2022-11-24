package producer_consumer_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedRes {
  private Queue<Integer> queue= new LinkedList<>();
  private int limit;
  final Lock lock=new ReentrantLock();
  final Condition notFull = lock.newCondition();
  final Condition notEmpty = lock.newCondition();


  public SharedRes(int limit) {
    this.limit = limit;
  }

  public void produce(Integer i)  {
    lock.lock();
    while(queue.size() == limit) {
      try {
        notFull.await();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    queue.add(i);
    notEmpty.signal();
    lock.unlock();
  }


  public Integer remove(){
    lock.lock();
    while(queue.isEmpty()) {
      try {
        notEmpty.await();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    Integer i = queue.remove();
    notFull.signal();
    lock.unlock();
    return i;
  }
}
