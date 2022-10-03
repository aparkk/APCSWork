//
// Diff21.java
//

class Diff21
{
  public static void testDiff21(int num)
  {
    System.out.println(num + ": " + diff21(num));
  }

  public static int diff21(int n)
  {
    if (n > 21)
      return 2 * (n - 21);

    return (21 - n);
  }

  public static void main(String[] args)
  {
    testDiff21(19);
    testDiff21(10);
    testDiff21(0);
  }
}
