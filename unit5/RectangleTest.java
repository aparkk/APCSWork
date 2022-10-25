//
// RectangleTest.java
//


public class RectangleTest
{
  public static void testArea(Rectangle r, double expected)
  {
    double actual = r.area();

    System.out.println("base: " + r.base() + " height: " + r.height() +
    "\nexpected area: " + expected + "\nactual area: " + actual);

    if (Math.abs(actual - expected) < .001)
      System.out.println("yay <3 !!");
    else
      System.out.println("wrong </3 !");
  }

  public static void testPerimeter(Rectangle r, double expected)
  {
    double actual = r.perimeter();

    System.out.println("\nbase: " + r.base() + " height: " + r.height() +
    "\nexpected perimeter: " + expected + "\nactual perimeter: " + actual);

    if (Math.abs(actual - expected) < .001)
      System.out.println("yay <3 !!");
    else
      System.out.println("wrong </3 !");
  }

  public static void testDL(Rectangle r, double expected)
  {
    double actual = r.diagonalLength();

    System.out.println("\nbase: " + r.base() + " height: " + r.height() +
    "\nexpected diagonal length: " + expected + "\nactual diagonal length: " + actual);

    if (Math.abs(actual - expected) < .001)
      System.out.println("yay <3 !!");
    else
      System.out.println("wrong </3 !");
  }

  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(6, 8);
    System.out.println("rectangle 1 area: " + r1.area());
    System.out.println("rectangle 1 perimeter: " + r1.perimeter());
    System.out.println("rectangle 1 diagonal length: " + r1.diagonalLength());

    Rectangle r2 = new Rectangle(20, 40);
    System.out.println("\nrectangle 2 area: " + r2.area());
    System.out.println("rectangle 2 perimeter: " + r2.perimeter());
    System.out.println("rectangle 2 diagonal length: " + r2.diagonalLength());


    System.out.println("\nrectangle 1 tests:");
    testArea(r1, 48);
    testPerimeter(r1, 28);
    testDL(r1, 10);

    System.out.println("\nrectangle 2 tests:");
    testArea(r2, 800);
    testPerimeter(r2, 120);
    testDL(r2, 44.7214);

  }
}
