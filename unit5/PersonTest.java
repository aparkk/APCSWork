//
// PersonTest.java
//


public class PersonTest
{
  public static void testGreeting(Person p, String expected)
  {
    String actual = p.greeting();

    System.out.println("\nname: " + p.name() + " pets #: " + p.numOfPets() +
    "\nexpected greeting: " + expected + "\nactual greeting: " + actual);

    if (expected.equals(actual))
      System.out.println("yay <3 !!");
    else
      System.out.println("wrong </3 !");
  }

  public static void main(String[] args)
  {
    Person p = new Person("Ava", 3);
    System.out.println(p.greeting());

    Person p2 = new Person("Alex", 0);
    System.out.println(p2.greeting());


    testGreeting(p, "Hello, my name is Ava and I have 3 pets.");
    testGreeting(p2, "Hello, my name is Alex and I have 0 pets.");
  }
}
