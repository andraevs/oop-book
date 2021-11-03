package factory;

public class Main {
    public static void main(String[] args) {
        LoggingDecorator<Integer> ld=new LoggingDecorator<>(MyList.getList(ListType.LinkedList));
        ld.add(10);
    }
}
