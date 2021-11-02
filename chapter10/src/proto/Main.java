package proto;

public class Main {
  public static void main(String[] args) {
    Character fighter = new Character(10,8,6,
            2,3,1, "fighter","Jack");
    try {
      Character thief=fighter.clone();
      thief.setCharisma(2);
      thief.setCharacterClass("thief");
      thief.setDexterity(8);
      thief.setStrength(4);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
