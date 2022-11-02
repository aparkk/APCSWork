//
// CountLucky.java
//


public class CountLucky
{
  public static int countLucky(int [] nums)
  {
    int count = 0;

    for (int i = 0; i < nums.length; i++)
    {
      if (nums[i] % 7 == 0 || nums[i] % 10 == 7)
        count++;
    }

    return count;
  }

  public static void testCountLucky(int [] nums,
                                    int expected)
  {
    int answer = countLucky(nums);

    System.out.print("\nnumber array: {" + nums[0]);
    for (int i = 1; i < nums.length; i++)
    {
      System.out.print(", " + nums[i] );
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
    int[] nums = {1, 2, 3};
    int[] nums2 = {7, 13, 17};
    int[] nums3 = {107, 207};

    testCountLucky(nums, 0);
    testCountLucky(nums2, 2);
    testCountLucky(nums3, 2);
  }
}
