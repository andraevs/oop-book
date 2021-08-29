package generictreeset;

public class Employee implements Comparable<Employee>{
  public Employee(String name) {
    this.name = name;
  }

  protected String name;
  @Override
  public int compareTo(Employee o) {
    return name.compareTo(o.name);
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            '}';
  }
}
