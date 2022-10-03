//
// Attention.java
//


public class Attention
{
  public static void testAttention(String str)
  {
    System.out.println(str + ", gets attention? " + attention(str));
  }

  public static boolean attention(String str)
  {
    if (str.substring(0, 9).equals("Hey, you!"))
      return true;

    return false;
  }

  public static void main(String[] args)
  {
    testAttention("Hello, my name is Inigo Montoya.");
    testAttention("Excuse me, Dr. Kessner?");
    testAttention("Hey, you! Give me your code!");
  }
}
