package constructors;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='"+name +"'}";
    }

    public static void main(String[] args) {

        Object o=new Person("John");
        System.out.println(o);
        Person p=new Person("John");
        System.out.println(p);
    }
}
