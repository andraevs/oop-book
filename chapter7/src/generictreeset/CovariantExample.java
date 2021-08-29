package generictreeset;

public class CovariantExample {
  public static void displayEmployees(GenericTreeSet<?> emps){
    emps.inOrder();
  }

  public static void main(String[] args) {
    GenericTreeSet<Employee> emps = new GenericTreeSet<>();
    emps.add(new Employee("Andrew"));
    emps.add(new Employee("John"));
    displayEmployees(emps);
    GenericTreeSet<Manager> mans = new GenericTreeSet<>();
    mans.add(new Manager("Andrew"));
    mans.add(new Manager("John"));
    displayEmployees(mans);


  }
}
