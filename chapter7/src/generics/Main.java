package generics;

public class Main {
    public static void main(String[] args) {
        Container<Integer> cInt = new Container<>();
        cInt.setVal(12);
        Integer res = cInt.getVal();
        cInt.setVal("hello");

    }
}
