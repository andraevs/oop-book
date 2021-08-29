package generictreeset;

public class GenericMain {
  public static void main(String[] args) {
    GenericTreeSet<String> bst = new GenericTreeSet<>();
    bst.add("c");
    bst.add("b");
    bst.add("a");
    bst.inOrder();
  }
}
