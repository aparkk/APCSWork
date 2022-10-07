//
// Vampire.java
//


public class Vampire
{
    public static void testIsVampire(float hour, boolean awake, boolean expected)
    {
      boolean ans = isVampire(hour, awake);

      System.out.print ("hour: " + hour + " awake: " + awake + " expected: " + expected +
       " answer: " + ans);

      if (ans == expected)
        System.out.println (" CORRECT!");
      else
        System.out.println (" WRONG!");
    }

    public static boolean isVampire(float hour, boolean awake)
    {
      if (!awake && (hour >= 6 || hour <= 22))
        return true;

      if (awake && (hour < 6 || hour > 22))
        return true;

      return false;
    }

    public static void main(String[] args)
    {
        testIsVampire(7.5f, true, false);
        testIsVampire(23.2f, true, true);
        testIsVampire(6f, false, true);
    }
}
