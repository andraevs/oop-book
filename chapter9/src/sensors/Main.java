package sensors;

import producer_consumer_1.Consumer;
import producer_consumer_1.Producer;
import producer_consumer_1.SharedRes;

public class Main {
  public static void main(String[] args) {
    EventQueue shared = new EventQueue(5);
    Sensor s1 =new Sensor("S1",shared, EventType.CO2, "Living Room");
    Sensor s2 =new Sensor("S2",shared,EventType.FIRE, "Hallway");
    Sensor s3 =new Sensor("S3",shared,EventType.WATER,"Bathroom");
    Sensor s4 =new Sensor("S4",shared,EventType.FIRE,"Kitchen");
    Dispatcher d1 = new Dispatcher("D1",shared);

    s1.start(); s2.start(); s3.start(); s4.start(); d1.start();
  }
}
