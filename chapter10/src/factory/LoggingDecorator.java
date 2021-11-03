package factory;

public class LoggingDecorator<T> implements MyList<T>{
    private MyList<T> target;

    public LoggingDecorator(MyList<T> target) {
        this.target = target;
    }

    @Override
    public void add(T t) {
        target.add(t);
        System.out.println(t+" was added");
    }

    @Override
    public T get(int index) {
        return target.get(index);
    }
}
