package app;

import domain.Employee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("John",100, LocalDate.of(2020,1,2));
        Employee e2=new Employee("Mary",200);
        System.out.println(e1);
        e1.raiseSalary(0.17);
        System.out.println(e1);
    }
}
