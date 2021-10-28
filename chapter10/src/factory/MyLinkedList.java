package factory;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<T> implements MyList<T>{
  private List<T> list = new LinkedList<>();

  @Override
  public void add(T t) {
    list.add(t);
  }

  @Override
  public T get(int index) {
    return list.get(index);
  }
}
