package builder;

public class Main {
  public static void main(String[] args) {
    Car fordTrend=new Car.CarBuilder("Ford",2009,87,Fuel.DIESEL,"xyz").build();
    Car fordTitanium=new Car.CarBuilder("Ford",2018,125,Fuel.DIESEL,"abc").sound(Sound.MP3).navigation(Navigation.GPS).build();
    Car fordEco = new Car.CarBuilder("Ford",2019,100,Fuel.PETROL,"yhd").AC(AC.AUTO).build();
  }
}
