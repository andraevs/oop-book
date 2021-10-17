package touristic;

import java.util.HashSet;
import java.util.Set;

public class TouristicPackage {
  private String name;
  private int price;
  private Set<Attraction> attractions=new HashSet<>();

  public TouristicPackage(String name, int price, Set<Attraction> attractions) {
    this.name = name;
    this.price = price;
    this.attractions = attractions;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public Set<Attraction> getAttractions() {
    return attractions;
  }
}
