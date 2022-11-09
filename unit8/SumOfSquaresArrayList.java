//
// SumOfSquaresArrayList.java
//

import java.util.*;


public class SumOfSquaresArrayList
{
  public static double sumOfSquares(ArrayList<Double> nums)
  {
    double sum = 0;

    for (int i = 0; i < nums.size(); i++)
    {
      sum += nums.get(i) * nums.get(i);
    }

    return sum;
  }

  public static void testSumOfSquares(ArrayList<Double> nums,
                                    double expected)
  {
    double answer = sumOfSquares(nums);

    System.out.print("\nnumber array: {" + nums.get(0));
    for (int i = 1; i < nums.size(); i++)
    {
      System.out.print(", " + nums.get(i));
    }

    System.out.println("} \nexpected sum of squares: " + expected
                        + "\nactual sum of squares: " + answer);


    if (Math.abs(answer - expected) < 1e-6)
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");

  }

  public static void main(String[] args)
  {
    ArrayList<Double> nums1 = new ArrayList<Double>();
    nums1.add(0.0);

    ArrayList<Double> nums2 = new ArrayList<Double>();
    nums2.add(1.0);
    nums2.add(2.0);
    nums2.add(3.0);

    ArrayList<Double> nums3 = new ArrayList<Double>();
    nums3.add(2.0);
    nums3.add(2.0);
    nums3.add(2.0);

    testSumOfSquares(nums1, 0);
    testSumOfSquares(nums2, 14.0);
    testSumOfSquares(nums3, 12.0);
  }
}
