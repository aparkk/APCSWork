//
// Diff21.java
//


class Diff21
{
  public static void testDiff21(int num, int expected)
  {
    int ans = diff21(num);

    System.out.print ("num: " + num + " expected: " + expected +
     " answer: " + ans);

    if (ans == expected)
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");
  }

  public static int diff21(int n)
  {
    if (n > 21)
      return 2 * (n - 21);

    return (21 - n);
  }

  public static void main(String[] args)
  {
    testDiff21(19, 2);
    testDiff21(10, 11);
    testDiff21(21, 0);
  }
}
