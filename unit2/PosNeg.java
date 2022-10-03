//
// PosNeg.java
//


class PosNeg
{
    public static void testPosNeg(int a, int b, boolean negative)
    {
        System.out.println (a + ", " + b + ", " + negative + ": "
        + posNeg(a, b, negative));
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
        testPosNeg(1, -1, false);
        testPosNeg(-1, 1, false);
        testPosNeg(-4, -5, true);
    }
}
