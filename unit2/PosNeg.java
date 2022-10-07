//
// PosNeg.java
//


class PosNeg
{
    public static void testPosNeg(int a, int b, boolean negative, boolean expected)
    {
      boolean ans = posNeg(a, b, negative);

      System.out.print ("a: " + a + " b: " + b + " negative: " + negative +
       " expected: " + expected + " answer: " + ans);

      if (ans == expected)
        System.out.println (" CORRECT!");
      else
        System.out.println (" WRONG!");
    }

    public static boolean posNeg(int a, int b, boolean negative)
    {
      if (a < 0 && b > 0 && !negative)
        return true;

      if (a > 0 && b < 0 && !negative)
        return true;

      if (a < 0 && b < 0 && negative)
        return true;

      return false;
    }

    public static void main(String[] args)
    {
        testPosNeg(1, -1, false, true);
        testPosNeg(-1, 1, false, true);
        testPosNeg(-4, -5, true, true);
    }
}
