//
// MissingChar.java
//


public class MissingChar
{
  public static void testMissingChar(String str, int n, String expected)
  {
    String ans = missingChar(str, n);

    System.out.print ("original string: " + str + " n: " + n + " expected: " + expected +
     " answer: " + ans);

    if (ans.equals(expected))
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");
  }

  public static String missingChar(String str, int n)
  {
    return str.substring (0, n) + str.substring (n + 1);
  }

  public static void main(String[] args)
  {
    testMissingChar("kitten", 1, "ktten");
    testMissingChar("kitten", 0, "itten");
    testMissingChar("kitten", 4, "kittn");
  }
}
