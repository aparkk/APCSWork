//
// ParrotTrouble.java
//

class ParrotTrouble
{
  public static void testParrotTrouble(boolean talking, int hour)
  {
    if (talking)
      System.out.println("talking at hour " + hour +
      "? " + parrotTrouble(talking, hour));
    else
    System.out.println("not talking at hour " + hour +
    "? " + parrotTrouble(talking, hour));
  }

  public static boolean parrotTrouble(boolean talking, int hour)
  {
    if (talking && (hour < 7 || hour > 20))
      return true;

    return false;
  }

  public static void main(String[] args)
  {
    testParrotTrouble(true, 6);
    testParrotTrouble(true, 7);
    testParrotTrouble(false, 6);
  }
}
