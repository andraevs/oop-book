package linkedlist;

import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class LinkedList {
  private Node first;

  public void add(int val) {
    if (first == null)
      //List is empty, we add the new node as the first node
      first = new Node(val);
    else {
      Node current = first;
      //We use a node to iterate through the entire list, until it reaches the last element
      //We know it is the last element because it has no next node
      while (current.next != null)
        current = current.next;
      //Add a new node as the last element
      current.next = new Node(val);
    }
  }

    public int remove(){
      if (first == null)
        //Empty list has no first element
        throw new NoSuchElementException();
      else {
        int val = first.value;
        //Store the value and advance the first node to the next node
        first=first.next;
        return val;
      }
  }

  private static class Node{
    Node next;
    int value;

    public Node(int value) {
      this.value = value;
    }
  }


}
