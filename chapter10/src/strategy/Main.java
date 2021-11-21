package strategy;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> ints=new ArrayList<>(List.of(1,6,3,8,20,7));
    Collections.sort(ints, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1-o2;
      }
    });
    System.out.println(Arrays.toString(ints.toArray()));
    Collections.sort(ints, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2-o1;
      }
    });
    System.out.println(Arrays.toString(ints.toArray()));
  }

}
