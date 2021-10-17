package synchronization;

public class MainSync {
  public static void main(String[] args) throws InterruptedException {
    Account a1=new Account("A1",10000);
    Account a2=new Account("A2",10000);
    Thread t1 =new Thread(() -> {
      for(int i=0;i<10000;i++){
        a1.deposit(1);
        a2.withdraw(1);
      }
    });
    Thread t2= new Thread(() -> {
      for(int i=0;i<10000;i++){
        a2.deposit(1);
        a1.withdraw(1);
      }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(a1);
    System.out.println(a2);
  }
}
