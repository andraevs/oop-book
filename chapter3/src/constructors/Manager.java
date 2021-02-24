package constructors;

public class Manager extends Employee{
    private double bonus;
    private String clause;

    public Manager(String name, int salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(String name, int salary, double bonus,String clause) {
        this(name,salary,bonus);
        this.clause = clause;
    }
}
