package abstracts;

public class DebitAccount extends Account {

    public DebitAccount(String IBAN, long amount) {
        super(IBAN, amount);
    }

    @Override
    public boolean withdraw(long sum) {
        if(sum>getAmount())
            return false;
        setAmount(getAmount()-sum);
        return true;
    }
}
