package proto;

public class Character extends Prototype{

  @Override
  public Character clone() throws CloneNotSupportedException {
    return (Character)super.clone();
  }

  private int strength, constitution, dexterity, intelligence, wisdom, charisma;
  private String characterClass, name;

  public Character(int strength, int constitution, int dexterity, int intelligence, int wisdom, int charisma, String characterClass, String name) {
    this.strength = strength;
    this.constitution = constitution;
    this.dexterity = dexterity;
    this.intelligence = intelligence;
    this.wisdom = wisdom;
    this.charisma = charisma;
    this.characterClass = characterClass;
    this.name = name;
    if(!checkAttributes())
      throw new IllegalArgumentException("Attributes cannot be negative and sum of attributes cannot exceed 30");
  }

  public void setStrength(int strength) {
    int oldStrength = this.strength;
    this.strength = strength;
    if(!checkAttributes()){
      this.strength = oldStrength;
      throw new IllegalArgumentException("Attributes cannot be negative and sum of attributes cannot exceed 30");
    }
  }

  private boolean checkAttributes(){
    if(strength <= 0 || constitution <= 0 || dexterity <= 0 || intelligence <= 0 || wisdom <= 0 || charisma <= 0)
      return false;
    if(strength + constitution +dexterity +intelligence +wisdom +charisma > 30)
      return false;
    return true;
  }

  public void setConstitution(int constitution) {
    this.constitution = constitution;
  }

  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public void setWisdom(int wisdom) {
    this.wisdom = wisdom;
  }

  public void setCharisma(int charisma) {
    this.charisma = charisma;
  }

  public void setCharacterClass(String characterClass) {
    this.characterClass = characterClass;
  }

  public void setName(String name) {
    this.name = name;
  }
}
