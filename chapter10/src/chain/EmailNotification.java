package chain;

public class EmailNotification extends NotificationService{

  @Override
  public void handle(SensorEvent se) {
    if(se.getType()==EventType.WATER)
      System.out.println("Email was sent for event "+se);
    if(next!=null)
      next.handle(se);
  }
}
