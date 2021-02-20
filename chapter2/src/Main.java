import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person john=new Person("john","123", LocalDate.now(),
                new Address("Bucharest","Poli"));
        Account ac1=new Account("12345",15);
        Account ac2=new Account("45678",60);
        Account ac3=new Account("24680",30);
        john.addAccount(ac1);
        john.addAccount(ac2);
        john.addAccount(ac3);
        ac1.deposit(200);
        ac2.withdraw(10);
        ac3.withdraw(100);
        System.out.println(john);
    }
}
