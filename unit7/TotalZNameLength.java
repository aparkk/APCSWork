//
// TotalZNameLength.java
//


public class TotalZNameLength
{
  public static int countZNames(String [] words)
  {
    int total = 0;

    for (int i = 0; i < words.length; i++)
    {
      if (words[i].charAt(0) == 'z' || words[i].charAt(0) == 'Z')
        total += words[i].length ();
    }

    return total;
  }

  public static void testCountZNames(String [] words,
                                    int expected)
  {
    int answer = countZNames(words);

    System.out.print("\nword array: {" + words[0]);
    for (int i = 1; i < words.length; i++)
    {
      System.out.print(", " + words[i] );
    }

    System.out.println("} \nexpected total length: " + expected
                        + "\nactual total length: " + answer);


    if (answer == expected)
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");

  }

  public static void main(String[] args)
  {
    String[]words = {"Dr. Kessner", "Dr. Sands"};
    String[]words2 = {"Zorro", "zero", "zippy"};

    testCountZNames(words, 0);
    testCountZNames(words2, 14);
  }
}
