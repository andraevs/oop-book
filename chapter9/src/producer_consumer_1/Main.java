package producer_consumer_1;

public class Main {
  public static void main(String[] args) {
    SharedRes shared = new SharedRes(5);
    Producer p1 =new Producer("P1",shared);
    Producer p2 =new Producer("P2",shared);
    Producer p3 =new Producer("P3",shared);
    Consumer c1 = new Consumer("C1",shared);
    Consumer c2 = new Consumer("C2",shared);
    Consumer c3 = new Consumer("C3",shared);
    p1.start(); p2.start(); p3.start(); c1.start(); c2.start(); c3.start();
  }
}
