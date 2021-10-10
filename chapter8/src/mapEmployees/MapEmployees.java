package mapEmployees;

import sets.Employee;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class MapEmployees {
  public static void main(String[] args) {
    List<Employee> emps = List.of(
            new Employee("John",99, LocalDate.of(2021,1,1)),
            new Employee("Mary",140, LocalDate.of(2020,1,1)),
            new Employee("Lucas",120, LocalDate.of(2021,1,1)),
            new Employee("Harry",250, LocalDate.of(2021,1,1))
    );
    System.out.println(mapEmployees(emps));
  }

  public static Map<Integer,Integer> mapEmployees(List<Employee> emps){
    Map<Integer,Integer> mapEmps = new TreeMap<>();
    mapEmps.put(100,0);
    mapEmps.put(200,0);
    mapEmps.put(201,0);
    for(Employee e : emps){
      if(e.getSalary()<100)
        mapEmps.put(100,mapEmps.get(100)+1);
      else
        if(e.getSalary()<200)
          mapEmps.put(200,mapEmps.get(200)+1);
        else
          mapEmps.put(201,mapEmps.get(201)+1);
    }
    return mapEmps;
  }
}
