public class Account {
    private Person owner;
    private String IBAN;
    private long amount;

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
}
