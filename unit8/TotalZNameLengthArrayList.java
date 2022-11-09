//
// TotalZNameLengthArrayList.java
//

import java.util.*;


public class TotalZNameLengthArrayList
{
  public static int countZNames(ArrayList<String> words)
  {
    int total = 0;

    for (int i = 0; i < words.size(); i++)
    {
      if (words.get(i).charAt(0) == 'z' || words.get(i).charAt(0) == 'Z')
        total += words.get(i).length ();
    }

    return total;
  }

  public static void testCountZNames(ArrayList<String> words,
                                    int expected)
  {
    int answer = countZNames(words);

    System.out.print("\nword array: {" + words.get(0));
    for (int i = 1; i < words.size(); i++)
    {
      System.out.print(", " + words.get(i));
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
    ArrayList<String> words1 = new ArrayList<String>();
    words1.add("Dr. Kessner");
    words1.add("Dr. Sands");

    ArrayList<String> words2 = new ArrayList<String>();
    words2.add("Zorro");
    words2.add("zero");
    words2.add("zippy");

    testCountZNames(words1, 0);
    testCountZNames(words2, 14);
  }
}
