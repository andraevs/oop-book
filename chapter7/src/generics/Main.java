package generics;

public class Main {
    public static void main(String[] args) {
        Container<Integer,String> c = new Container<>();
        c.setVal1(1);
        c.setVal2("1");


        NormalClass.<Integer>display(12);
        NormalClass.display("hello");


    }
}
