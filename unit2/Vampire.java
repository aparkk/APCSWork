//
// Vampire.java
//


public class Vampire
{
    public static void testIsVampire(float hour, boolean awake)
    {
        System.out.println ("hour (" + hour + "), awake (" + awake
         + "): " + isVampire(hour, awake));
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
        testIsVampire(7.5f, true);
        testIsVampire(23.2f, true);
        testIsVampire(6f, false);
    }
}
