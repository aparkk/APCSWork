//
// ParrotTrouble.java
//

class ParrotTrouble
{
  public static void testParrotTrouble(boolean talking, int hour, boolean expected)
  {
    boolean ans = parrotTrouble(talking, hour);

    System.out.print ("talking: " + talking + " hour: " + hour + " expected: " +
    expected + " answer: " + ans);

    if (ans == expected)
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");
  }

  public static boolean parrotTrouble(boolean talking, int hour)
  {
    if (talking && (hour < 7 || hour > 20))
      return true;

    return false;
  }

  public static void main(String[] args)
  {
    testParrotTrouble(true, 6, true);
    testParrotTrouble(true, 7, false);
    testParrotTrouble(false, 6, false);
  }
}
