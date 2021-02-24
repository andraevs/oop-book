package constructors;

public class Employee extends Person{
    private int salary;

    public void increaseSalary(int sum){
        salary+=sum;
    }

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }
}
