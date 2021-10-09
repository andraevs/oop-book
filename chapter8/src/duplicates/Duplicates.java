package duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
  public static void main(String args[]){
    List<String> in=List.of("Ann","Mary","Ann","John","Jack","Alfred","Jack","Ann");
    System.out.println(duplicates(in));
  }

  public static List<String> duplicates(List<String> in){
    Set<String> noDups=new HashSet<>();
    Set<String> duplicates=new HashSet<>();
    for(String s : in)
      if(!noDups.add(s))
        duplicates.add(s);
    return new ArrayList<>(duplicates);
  }
}
