package touristic;

import java.util.HashSet;
import java.util.List;

public class MainTouristic {
  public static void main(String[] args) {
    Attraction a1=new Attraction("Paltinis","Sibiu");
    Attraction a2=new Attraction("Predeal","Prahova");
    Attraction a3=new Attraction("Olimp","Constanta");

    List<TouristicPackage> tpacks = List.of(
            new TouristicPackage("Mountain Trip",250,new HashSet<>(List.of(a1,a2))),
            new TouristicPackage("Full Trip",500,new HashSet<>(List.of(a1,a2,a3))),
            new TouristicPackage("Sibiu Trip",120,new HashSet<>(List.of(a1))),
            new TouristicPackage("Combined Trip",400,new HashSet<>(List.of(a2,a3)))
    );

    System.out.println(Stats.timesSold(tpacks));
    System.out.println(Stats.relativeSold(tpacks));
  }
}
