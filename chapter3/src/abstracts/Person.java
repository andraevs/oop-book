package abstracts;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
    private String name;
    private final String CNP;
    private final LocalDate birthDate;
    private Address address;
    private Account[] accounts=new Account[10];
    private int noAccounts;

    public Person(String name, String CNP, LocalDate birthDate, Address address) {
        this.name = name;
        this.CNP = CNP;
        this.birthDate = birthDate;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addAccount(Account ac){
        if(noAccounts == accounts.length){
            accounts= Arrays.copyOf(accounts,accounts.length*2);
        }
        accounts[noAccounts++]=ac;
        ac.setOwner(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", CNP='" + CNP + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }

}
