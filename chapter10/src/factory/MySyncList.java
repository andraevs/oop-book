package factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySyncList<T> implements MyList<T> {
  private List<T> list = Collections.synchronizedList(new ArrayList<>());
  @Override
  public void add(T t) {
    list.add(t);
  }
  @Override
  public T get(int index) {
    return list.get(index);
  }
}
