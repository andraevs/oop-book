package compare;

public class Account implements Comparable{
  private Person owner;
  private String IBAN;
  private long amount;

  /* hidden */

  public Account(String IBAN, long amount) {
    this.IBAN = IBAN;
    this.amount = amount;
  }

  public Person getOwner() {
    return owner;
  }

  public String getIBAN() {
    return IBAN;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public long getAmount() {
    return amount;
  }

  public void deposit(long sum){
    amount+=sum;
  }

  public boolean withdraw(long sum){
    if(sum>amount)
      return false;
    amount-=sum;
    return true;
  }

  @Override
  public String toString() {
    return "Account{" +
            "IBAN='" + IBAN + '\'' +
            ", amount=" + amount +
            '}';
  }

  @Override
  public int compareTo(Object o) {
    if(this == o)
      return 0;
    Account other= (Account) o;
    if(amount < other.amount)
      return -1;
    if(amount > other.amount)
      return 1;
    return IBAN.compareTo(other.IBAN);

  }
}
