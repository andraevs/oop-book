package sensors;

import producer_consumer_1.SharedRes;

import java.time.LocalDate;
import java.util.Random;

public class Sensor extends Thread{
  private EventQueue sharedRes;
  private EventType type;
  private String location;

  public Sensor(String name, EventQueue sharedRes, EventType type,String location) {
    super(name);
    this.sharedRes = sharedRes;
    this.type = type;
    this.location=location;
  }

  public void run(){
    String[] locations={"Living Room","Kitchen","Bathroom","Hallway"};

    Random ran = new Random();
    while(true){
      SensorEvent sensorEvent = new SensorEvent(LocalDate.now(),location,type);
      sharedRes.produce(sensorEvent);
      System.out.println(getName() +" added "+sensorEvent);
    }
  }
}