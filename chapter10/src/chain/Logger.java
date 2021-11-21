package chain;

public class Logger extends NotificationService{

  @Override
  public void handle(SensorEvent se) {
      System.out.println("Event  "+se+" was logged");
    if(next!=null)
      next.handle(se);
  }
}