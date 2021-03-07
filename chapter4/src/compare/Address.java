package compare;

public class Address implements Comparable{
  private String city;
  private String street;

  /* hidden */
  public Address(String city, String street) {
    this.city = city;
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  @Override
  public int compareTo(Object o) {
    if(this==o)
      return 0;
    Address other= (Address) o;
    if(city.compareTo(other.city)!=0)
      return city.compareTo(other.city);
    return street.compareTo(other.street);
  }
}
