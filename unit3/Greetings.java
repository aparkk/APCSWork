//
// Greetings.java
//


public class Greetings
{
  public static void testGreetings(String name, String expected)
  {
    String ans = greetings(name);

    System.out.print ("name: " + name + " expected greeting: " + expected +
     " actual greeting: " + ans);

    if (ans.equals(expected))
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");
  }

  public static String greetings(String name)
  {
    return "Hello, " + name + ", how are you?";
  }

  public static void main(String[] args)
  {
    testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
    testGreetings("Ascii Cat", "Hello, Ascii Cat, how are you?");
    testGreetings("Sydneys", "Hello, Sydneys, how are you?");
  }
}
