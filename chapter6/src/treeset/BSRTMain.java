package treeset;

public class BSRTMain {
  public static void main(String[] args) {
    BST bst = new BST();
    bst.add(6);
    bst.add(4);
    bst.add(2);
    bst.add(5);
    bst.add(8);
    bst.add(9);
    bst.inOrder();
  }
}
