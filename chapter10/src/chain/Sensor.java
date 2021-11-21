package chain;


import java.time.LocalDate;
import java.util.Random;

public class Sensor extends Thread{
  private String location;
  private NotificationService notificationService;

  public Sensor(String name, String location) {
    super(name);
    this.location=location;
  }

  public NotificationService getNotificationService() {
    return notificationService;
  }

  public void setNotificationService(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  public void run(){
    Random ran = new Random();
    while(true){
      EventType type = EventType.values()[ran.nextInt(EventType.values().length)];
      SensorEvent sensorEvent = new SensorEvent(LocalDate.now(),location,type);
      notificationService.handle(sensorEvent);
    }
  }
}