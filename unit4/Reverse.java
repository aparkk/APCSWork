//
// Reverse.java
//


class Reverse
{
  public static void testReverse(String str, String expected)
  {
    String ans = reverse(str);

    System.out.print ("string: " + str + " expected: " + expected +
     " answer: " + ans);

    if (ans.equals(expected))
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");

  }

  public static String reverse(String str)
  {
    String ans = "";

    for (int i = str.length() - 1; i >= 0; i--)
      ans += str.charAt(i);

    return ans;

  }

  public static void main(String[] args)
  {
    testReverse("bad", "dab");
    testReverse("Hello, world!", "!dlrow ,olleH");
    testReverse("tacocat", "tacocat");
    testReverse("reverse", "esrever");
    testReverse("How are you?", "?uoy era woH");

  }
}
