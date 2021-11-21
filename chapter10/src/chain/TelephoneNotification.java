package chain;

public class TelephoneNotification extends NotificationService{

  @Override
  public void handle(SensorEvent se) {
    if(se.getType()==EventType.WATER || se.getType()==EventType.FIRE)
      System.out.println("A call was made for event  "+se);
    if(next!=null)
      next.handle(se);
  }
}
