package sets;

import java.time.LocalDate;
import java.util.*;

public class MainSets {
  public static void main(String[] args) {
    List<Employee> emps = List.of(
            new Employee("John",120, LocalDate.of(2021,1,1)),
            new Employee("Mary",140, LocalDate.of(2020,1,1)),
            new Employee("John",120, LocalDate.of(2021,1,1))
    );
    Set<Employee> hashEmps = new HashSet<>(emps);
    Iterator<Employee> employeeIterator= hashEmps.iterator();
//    while(employeeIterator.hasNext())
//      System.out.print(employeeIterator.next()+" ");

    Set<Employee> treeEmps = new TreeSet<>(emps);
    System.out.println(treeEmps);

  }
}
