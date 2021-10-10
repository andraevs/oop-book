package sets;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employee(String n, int s, LocalDate h) {
        name = n;
        salary = s;
        hireDate = h;
    }

    @Override
    public boolean equals(Object o) {
        // no need to compare if it is the same object instance
        if (this == o) return true;
        //objects from different classes cannot be equal
        if (o == null || getClass() != o.getClass()) return false;
        //cast the argument in order to access the fields
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDate);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", hireDate=" + hireDate + '}';
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public int compareTo(Employee o) {
        Employee employee = (Employee) o;
        //We need to look at the same fields as equals
        if(name.compareTo(employee.name) !=0)
            return name.compareTo(employee.name);
        else
            if(salary != employee.salary)
                return salary-employee.salary;
            else
                return hireDate.compareTo(employee.hireDate);
    }
}
