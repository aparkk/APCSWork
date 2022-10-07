//
// Attention.java
//


class Attention
{
  public static void testAttention(String str, boolean expected)
  {
    Boolean ans = attention(str);

    System.out.print ("string: " + str + " expected: " + expected +
     " answer: " + ans);

    if (ans == expected)
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");
  }

  public static boolean attention(String str)
  {
    if (str.substring(0, 9).equals("Hey, you!"))
      return true;

    return false;
  }

  public static void main(String[] args)
  {
    testAttention("Hello, my name is Inigo Montoya.", false);
    testAttention("Excuse me, Dr. Kessner?", false);
    testAttention("Hey, you! Give me your code!", true);
  }
}
