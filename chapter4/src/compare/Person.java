package compare;

import java.time.LocalDate;
import java.util.Arrays;

public class Person implements Comparable{
  private String name;
  private final String CNP;
  private final LocalDate birthDate;
  private Address address;
  private Account[] accounts=new Account[10];
  private int noAccounts;

  /* hidden */

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
    return "compare.Person{" +
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

  @Override
  public int compareTo(Object o) {
    //short-circuit, if objects are the same then they are equal
    if(this == o)
      return 0;
        /* we need to cast the argument to Person to access the fields
        if the argument is not a person this will throw an exception which is correct as
        it is not relevant to compare objects of different types */
    Person other = (Person) o;
    //we reuse the compareTo implementation from String as String also implements Comparable
    return name.compareTo(other.name);
  }
}
