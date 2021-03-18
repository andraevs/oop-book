package shapes;

/**
 * A point representing a location in (x,y) coordinate space, specified in integer precision.
 *
 * @author Andrei
 */
public class Point {
  /**
   * The X coordinate of this <code>Point</code>.
   */
  private int x;
  /**
   * The Y coordinate of this <code>Point</code>.
   */
  private int y;

  /**
   * Creates a point at the specified (x,y) location in the coordinate space.
   *
   * @param x the X coordinate of the <code>Point</code>, >= 0
   * @param y the Y coordinate of the <code>Point</code>, >=0
   * @throws <code>IllegalArgumentException</code> if x or y < 0
   */
  Point(int x, int y) {
    if(x<0 || y<0)
      throw new IllegalArgumentException("X or Y less than 0");
    this.x = x;
    this.y = y;
  }

  /**
   * Creates a point at the origin (0, 0) of the coordinate space.
   */
  Point() {
    x = 0;
    y = 0;
  }

  /**
   * Returns the X coordinate of this <code>Point</code> in integer precision.
   *
   * @return the X coordinate of this Point
   */
  public int getX() {
    return x;
  }

  /**
   * Returns the Y coordinate of this <code>Point</code> in integer precision.
   *
   * @return the Y coordinate of this Point
   */
  public int getY() {
    return y;
  }

  /**
   * Returns a string representation of this <code>Point</code> and its location in the (x,y) coordinate space.
   *
   * @return a string representation of this point
   */
  public String toString() {
    return "x=" + x + ", y=" + y;
  }

  /**
   * Translates this <code>Point</code> in the (x,y) coordinate space.
   *
   * @param deltaX translation on X axis
   * @param deltaY translation on Y axis
   */
  public void move(int deltaX, int deltaY) {
    x = x + deltaX;
    y = y + deltaY;
  }

  /**
   * Returns the Euclidian distance between two points in double precision
   *
   * @param x1 X coordinate of the first point
   * @param x2 X coordinate of the second point
   * @param y1 Y coordinate of the first point
   * @param y2 Y coordinate of the second point
   * @return distance between the two points
   * @see <a href="http://en.wikipedia.org/wiki/Euclidean_distance">Euclidian distance</a>
   */
  public static double dist(int x1, int x2,
                            int y1, int y2) {
    return Math.sqrt((x1 - x2) * (x1 - x2) +
            (y1 - y2) * (y1 - y2));
  }
}

