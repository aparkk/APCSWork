//
// IcyHot.java
//


class IcyHot
{
    public static void testIcyHot(int temp1, int temp2, boolean expected)
    {
        boolean ans = icyHot(temp1, temp2);

        System.out.print ("temp1: " + temp1 + " temp2: " + temp2 + " expected: " + expected +
         " answer: " + ans);

        if (ans == expected)
          System.out.println (" CORRECT!");
        else
          System.out.println (" WRONG!");
    }

    public static boolean icyHot(int temp1, int temp2)
    {
      if (temp1 < 0 && temp2 > 100)
        return true;

      if (temp1 > 100 && temp2 < 0)
        return true;

      return false;
    }

    public static void main(String[] args)
    {
        testIcyHot(120, -1, true);
        testIcyHot(-1, 120, true);
        testIcyHot(2, 120, false);
    }
}
