//
// BackAround.java
//


public class BackAround
{
  public static void testBackAround(String str, String expected)
  {
    String ans = backAround(str);

    System.out.print ("original string: " + " expected: " + expected +
     " answer: " + ans);

    if (ans.equals(expected))
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");
  }

  public static String backAround(String str)
  {
    return str.charAt(str.length() - 1) + str.substring(0) +
    str.charAt(str.length() - 1);
  }

  public static void main(String[] args)
  {
    testBackAround("cat", "tcatt");
    testBackAround("Hello", "oHelloo");
    testBackAround("a", "aaa");
  }
}
