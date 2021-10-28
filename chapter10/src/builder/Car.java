package builder;

import java.time.LocalDate;

public class Car {
  private final String brand;
  private final int productionYear;
  private final int power;
  private final Fuel fuel;
  private final String chassisNumber;
  private final Sound sound;
  private final Navigation navigation;
  private final AC ac;

  private Car(String brand, int productionYear, int power,
              Fuel fuel, String chassisNumber, Sound sound,
              Navigation navigation, AC ac) {
    this.brand = brand;
    this.productionYear = productionYear;
    this.power = power;
    this.fuel = fuel;
    this.chassisNumber = chassisNumber;
    this.sound = sound;
    this.navigation = navigation;
    this.ac = ac;
  }

  static class CarBuilder{
    private  String brand;
    private  int productionYear;
    private  int power;
    private  Fuel fuel;
    private  String chassisNumber;
    private  Sound sound=Sound.CD;
    private  Navigation navigation=Navigation.NONE;
    private  AC ac=AC.MANUAL;

    public CarBuilder(String brand, int productionYear, int power,
                      Fuel fuel, String chassisNumber) {
      this.brand = brand;
      this.productionYear = productionYear;
      this.power = power;
      this.fuel = fuel;
      this.chassisNumber = chassisNumber;
    }

    public CarBuilder sound(Sound sound){
      this.sound = sound;
      return this;
    }

    public CarBuilder navigation(Navigation navigation){
      this.navigation = navigation;
      return this;
    }

    public CarBuilder AC(AC ac){
      this.ac=ac;
      return this;
    }

    public Car build(){
      return  new Car(brand,productionYear,power,fuel,chassisNumber,sound,navigation,ac);
    }
  }
}
