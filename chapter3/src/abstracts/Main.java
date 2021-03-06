package abstracts;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person john=new Person("john","123", LocalDate.now(),
                new Address("Bucharest","Poli"));
        Account deb1=new DebitAccount("12345",15);
        Account cred1=new CreditAccount("45678",60,120);
        john.addAccount(deb1);
        john.addAccount(cred1);
        deb1.withdraw(30);
        deb1.withdraw(10);
        cred1.withdraw(200);
        cred1.withdraw(70);
        System.out.println(john);
    }
}
