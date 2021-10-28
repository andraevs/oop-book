package factory;

public interface MyList<T> {
  void add(T t);
  T get(int index);

  static <U> MyList<U> getList(ListType type){
    switch (type){
      case LinkedList: return new MyLinkedList<>();
      case SyncList: return new MySyncList<>();
      default: return new MyArrayList<>();
    }
  }
}
