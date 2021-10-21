package synchronization;

public class Account {
  private String id;
  private int amount;

  public Account(String id, int amount) {
    this.id = id;
    this.amount = amount;
  }

  public  synchronized void deposit(int sum){
    amount+=sum;
  }
  public  synchronized void withdraw(int sum){
    amount-=sum;
  }

  @Override
  public String toString() {
    return "Account{" +
            "id='" + id + '\'' +
            ", amount=" + amount +
            '}';
  }
}
