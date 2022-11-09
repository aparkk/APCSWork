//
// CountLuckyArrayList.java
//

import java.util.*;


public class CountLuckyArrayList
{
  public static int countLucky(ArrayList<Integer> nums)
  {
    int count = 0;

    for (int i = 0; i < nums.size(); i++)
    {
      if (nums.get(i) % 7 == 0 || nums.get(i) % 10 == 7)
        count++;
    }

    return count;
  }

  public static void testCountLucky(ArrayList<Integer> nums,
                                    int expected)
  {
    int answer = countLucky(nums);

    System.out.print("\nnumber array list: {" + nums.get(0));
    for (int i = 1; i < nums.size(); i++)
    {
      System.out.print(", " + nums.get(i));
    }

    System.out.println("} \nexpected # of lucky numbers: " + expected
                        + "\nactual # of lucky numbers: " + answer);


    if (answer == expected)
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");

  }

  public static void main(String[] args)
  {
    ArrayList<Integer> nums1 = new ArrayList<Integer>();
    nums1.add(1);
    nums1.add(2);
    nums1.add(3);

    ArrayList<Integer> nums2 = new ArrayList<Integer>();
    nums2.add(7);
    nums2.add(13);
    nums2.add(17);

    ArrayList<Integer> nums3 = new ArrayList<Integer>();
    nums3.add(107);
    nums3.add(207);


    testCountLucky(nums1, 0);
    testCountLucky(nums2, 2);
    testCountLucky(nums3, 2);
  }
}
