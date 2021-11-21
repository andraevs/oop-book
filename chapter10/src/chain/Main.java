package chain;

public class Main {
  public static void main(String[] args) {
    Sensor s1 =new Sensor("S1", "Living Room");
    EmailNotification emailNotification = new EmailNotification();
    TelephoneNotification telephoneNotification = new TelephoneNotification();
    Logger logger = new Logger();
    s1.setNotificationService(emailNotification);
    emailNotification.setNext(telephoneNotification);
    telephoneNotification.setNext(logger);
    s1.start();

  }
}
