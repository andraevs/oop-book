package domain;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employee(String n, int s, LocalDate h) {
        name = n;
        salary = s;
        hireDate = h;
    }

    public Employee(String n, int s) {
        name = n;
        salary = s;
        hireDate = LocalDate.now();
    }



    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", hireDate=" + hireDate + '}';
    }

    public void raiseSalary(double percent){
        salary = (int) Math.round((1+percent)*salary);
    }
}
