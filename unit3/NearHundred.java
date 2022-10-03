//
// NearHundred.java
//


public class NearHundred
{
  public static void testNearHundred(int n)
  {
    System.out.println(n + " is within 10 of 100 or 200? "
     + nearHundred(n));
  }

  public static boolean nearHundred(int n)
  {
    if (Math.abs(n - 100) <=10)
      return true;

    if (Math.abs(n - 200) <=10)
      return true;

    return false;
  }

  public static void main(String[] args)
  {
    testNearHundred(93);
    testNearHundred(90);
    testNearHundred(89);
  }
}
