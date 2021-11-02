package proto;

public abstract class Prototype implements Cloneable{

  // Change the visibility to public, any class can clone the object
  @Override
  public Object clone() throws CloneNotSupportedException {
    return (Prototype)super.clone();
  }
}
