package abstracts;

public class CreditAccount extends Account{
    private long maxCredit;

    public CreditAccount(String IBAN, long amount, long maxCredit) {
        super(IBAN, amount);
        this.maxCredit = maxCredit;
    }

    public long getMaxCredit() {
        return maxCredit;
    }

    @Override
    public boolean withdraw(long sum) {
        if(sum>getAmount()+maxCredit)
            return false;
        setAmount(getAmount()-sum);
        return true;
    }
}
