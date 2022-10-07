//
// Makes10.java
//


class Makes10
{
    public static void testMakes10(int a, int b, boolean expected)
    {
      boolean ans = makes10(a, b);

      System.out.print ("a: " + a + " b: " + b + " expected: " + expected +
       " answer: " + ans);

      if (ans == expected)
        System.out.println (" CORRECT!");
      else
        System.out.println (" WRONG!");

    }

    public static boolean makes10(int a, int b)
    {
      if (a == 10 || b == 10 || a + b == 10)
        return true;

      return false;
    }

    public static void main(String[] args)
    {
        testMakes10(9, 10, true);
        testMakes10(9, 9, false);
        testMakes10(1, 9, true);
    }
}
