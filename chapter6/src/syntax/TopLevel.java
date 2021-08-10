package syntax;

public class TopLevel {
  class IC {}

  public static void main(String[] args) {
    TopLevel tp = new TopLevel();
    TopLevel.IC ic1 = tp.new IC(); //ic1 has a  reference to tp
    TopLevel.IC ic2 = new TopLevel().new IC(); // ic2 has a reference to an anonymous TopLevel instance
  }
}
