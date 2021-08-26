package linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

  @Test
  void addToNewList(){
    LinkedList l = new LinkedList();
    l.add(13);
    assertEquals(13, l.remove());
  }

  @Test
  void removeFromEmptyList(){
    LinkedList l = new LinkedList();
    assertThrows(NoSuchElementException.class,
            () ->l.remove());
  }

  @Test
  void addMoreElements(){
    LinkedList l = new LinkedList();
    l.add(13);
    l.add(15);
    assertEquals(13, l.remove());
    assertEquals(15, l.remove());
  }

  @Test
  void iteratorTest(){
    LinkedList l = new LinkedList();
    l.add(13);
    l.add(15);
    Iterator it = l.iterator();
    assertTrue(it.hasNext());
    assertEquals(13, it.next());
    assertTrue(it.hasNext());
    assertEquals(15, it.next());
    assertFalse(it.hasNext());
  }
}