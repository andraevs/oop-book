package shapes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

class PointTest {

  @Test
  @DisplayName("Test move method")
  void move() {
    int deltaX = 5;
    int deltaY = -5;
    Point instance = new Point(0,0);
    instance.move(deltaX, deltaY);
    Assertions.assertEquals(5,instance.getX(),"Move method failed");
    Assertions.assertEquals(-5,instance.getY(),"Move method failed");
  }

  @Test
  @DisplayName("Test dist method")
  public void testDist() {
    System.out.println("dist");
    int x1 = 100;
    int x2 = -300;
    int y1 = 250;
    int y2 = 180;
    double expResult = 406.0785;
    double result = Point.dist(x1, x2, y1, y2);
    assertEquals(expResult, result, 0.0004,"Dist failed");
  }

  @Test
  @DisplayName("Constructor with negative inputs throws exception")
  public void testNegativeInitValues() {
    int x = 0;
    int y = -5;
    assertThrows(IllegalArgumentException.class, ()->new Point(x,y),"No exception thrown for negative values");
  }

}