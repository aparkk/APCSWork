//
// NearHundred.java
//


public class NearHundred
{
  public static void testNearHundred(int n, boolean expected)
  {
    boolean ans = nearHundred(n);

    System.out.print ("n: " + n + "expected: " + expected +
     "answer: " + ans);

    if (ans == expected)
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");
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
    testNearHundred(93, true);
    testNearHundred(90, true);
    testNearHundred(89, false);
  }
}
