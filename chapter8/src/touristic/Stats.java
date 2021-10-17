package touristic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stats {

  public static Map<Attraction,Integer> timesSold(List<TouristicPackage> tpacks){
    Map<Attraction,Integer> sold = new HashMap<>();
    for(TouristicPackage t : tpacks){
      for(Attraction a : t.getAttractions()){
        if(sold.containsKey(a))
          sold.put(a,sold.get(a)+1);
        else
          sold.put(a,1);
      }
    }
    return sold;
  }

  public static Map<Attraction,Double> relativeSold(List<TouristicPackage> tpacks){
    Map<Attraction,Integer> sold = timesSold(tpacks);
    int noPacks = tpacks.size();
    Map<Attraction,Double> relSold = new HashMap<>();
     for(Attraction a : sold.keySet())
       relSold.put(a,(double)sold.get(a)/noPacks);
    return relSold;
  }
}
