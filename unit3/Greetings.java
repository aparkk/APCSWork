//
// Greetings.java
//


public class Greetings
{
  public static void testGreetings(String name)
  {
    System.out.println(greetings(name));
  }

  public static String greetings(String name)
  {
    return "Hi " + name + "! How are you?";
  }

  public static void main(String[] args)
  {
    testGreetings("Dr. Kessner");
    testGreetings("Ascii Cat");
    testGreetings("Sydneys");
  }
}
