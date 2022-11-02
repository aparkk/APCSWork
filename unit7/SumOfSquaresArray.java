//
// SumOfSquaresArray.java
//


public class SumOfSquaresArray
{
  public static double sumOfSquares(double [] nums)
  {
    double sum = 0;

    for (int i = 0; i < nums.length; i++)
    {
      sum += nums[i] * nums[i];
    }

    return sum;
  }

  public static void testSumOfSquares(double [] nums,
                                    double expected)
  {
    double answer = sumOfSquares(nums);

    System.out.print("\nnumber array: {" + nums[0]);
    for (int i = 1; i < nums.length; i++)
    {
      System.out.print(", " + nums[i] );
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
    double[] nums = {0};
    double[] nums2 = {1.0, 2.0, 3.0};
    double[] nums3 = {2.0, 2.0, 2.0};

    testSumOfSquares(nums, 0);
    testSumOfSquares(nums2, 14.0);
    testSumOfSquares(nums3, 12.0);
  }
}
