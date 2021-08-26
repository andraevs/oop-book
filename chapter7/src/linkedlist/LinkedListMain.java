package linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList lString = new LinkedList();
        lString.add("hello");
        lString.add(4);
        String res1 = (String)lString.remove();
        String res2 = (String)lString.remove();
    }
}
