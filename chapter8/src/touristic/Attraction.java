package touristic;

import java.util.Objects;

public class Attraction {
  private String name;
  private String location;

  public Attraction(String name, String location) {
    this.name = name;
    this.location = location;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Attraction that = (Attraction) o;
    return Objects.equals(name, that.name) && Objects.equals(location, that.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location);
  }

  @Override
  public String toString() {
    return "Attraction{" +
            "name='" + name + '\'' +
            '}';
  }
}
