//
// Rectangle.java
//


public class Rectangle
{
  private double base, height;

  public Rectangle(double b, double h)
  {
      base = b;
      height = h;
  }

  public double base()
  {
    return base;
  }

  public double height()
  {
    return height;
  }

  public double area()
  {
    return base * height;
  }

  public double perimeter()
  {
    return 2 * (base + height);
  }

  public double diagonalLength()
  {
    return Math.sqrt(base * base + height * height);
  }
}
