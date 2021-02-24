package attributes;

public class BadManager extends Employee{
    public int salary =100;
    public void showSalaries(){
        System.out.println(salary);
        System.out.println(super.salary); //inherited salary
    }
}
