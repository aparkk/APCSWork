//
// CountOccurrences.java
//


class CountOccurrences
{
  public static void testCountOccurrences(String str, String str2, int expected)
  {
    int ans = countOccurrences(str, str2);

    System.out.print ("string: " + str + " repeat string: " + str2
    + " expected: " + expected + " answer: " + ans);

    if (ans == expected)
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");

  }

  public static int countOccurrences(String str, String str2)
  {
    int count = 0;

    for (int i = 0; i < str.length() - str2.length() + 1; i++)
    {
      if (str.substring(i, i + str2.length()).equals(str2))
        count++;
    }

    return count;
  }

  public static void main(String[] args)
  {
    testCountOccurrences("Mississippi", "iss", 2);
    testCountOccurrences("banananana", "na", 4);
    testCountOccurrences("Avava", "va", 2);
    testCountOccurrences("occurrences", "c", 3);
  }
}
