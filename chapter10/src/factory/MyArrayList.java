package factory;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> implements MyList<T> {
  private List<T> list = new ArrayList<>();


  @Override
  public void add(T t) {
    list.add(t);
  }

  @Override
  public T get(int index) {
    return list.get(index);
  }
}
