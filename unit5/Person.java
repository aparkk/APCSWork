//
// Person.java
//


public class Person
{
  private String name;
  private int numOfPets;

  public Person(String nameIn, int numOfPetsIn)
  {
    name = nameIn;
    numOfPets = numOfPetsIn;
  }

  public String name()
  {
    return name;
  }

  public int numOfPets()
  {
    return numOfPets;
  }

  public String greeting()
  {
    return "Hello, my name is " + name + " and I have "
    + numOfPets + " pets.";
  }
}
