package chain;

public abstract class NotificationService {
  protected NotificationService next;

  public abstract void  handle(SensorEvent se);


  public void setNext(NotificationService next) {
    this.next = next;
  }
}
