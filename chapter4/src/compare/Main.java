package compare;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Account[] accounts= {
            new Account("UK125", 720),
            new Account("RO124", 220),
            new Account("RO123", 220),
    };
    Arrays.sort(accounts);
    for(Account a : accounts)
      System.out.println(a);
  }


}
