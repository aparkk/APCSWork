//
// DoubleX.java
//


class DoubleX
{
    public static void testDoubleX(String str, boolean expected)
    {
      boolean ans = doubleX(str);

      System.out.print ("string: " + str + " expected: " + expected +
       " answer: " + ans);

      if (ans == expected)
        System.out.println (" CORRECT!");
      else
        System.out.println (" WRONG!");

    }

    public static boolean doubleX(String str)
    {
      int count = 0;

      for (int i = 0; i < str.length(); i++)
      {
        if (count == 1)
          break;

        if (str.charAt(i) == 'x')
        {
          count++;
          if (i < str.length() - 1 && str.charAt(i + 1) == 'x')
            return true;
        }
      }

      return false;
    }

    public static void main(String[] args)
    {
        testDoubleX("axxbb", true);
        testDoubleX("axaxax", false);
        testDoubleX("xxxxx", true);
    }
}
