//
// MissingChar.java
//


public class MissingChar
{
  public static void testMissingChar(String str, int n)
  {
    System.out.println(str + ", " + n + ": " + missingChar(str, n));
  }

  public static String missingChar(String str, int n)
  {
    return str.substring (0, n) + str.substring (n + 1);
  }

  public static void main(String[] args)
  {
    testMissingChar("kitten", 1);
    testMissingChar("kitten", 0);
    testMissingChar("kitten", 4);
  }
}
