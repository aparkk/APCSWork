//
// SumOfSquares.java
//


class SumOfSquares
{
  public static void testSumOfSquares(int n, int expected)
  {
    int ans = sumOfSquares(n);

    System.out.print ("num: " + " expected: " + expected +
     " answer: " + ans);

    if (ans == expected)
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");

  }

  public static int sumOfSquares(int n)
  {
    int ans = 0;

    for (int i = 1; i <= n; i++)
    {
      ans += i * i;
    }

    return ans;
  }

  public static void main(String[] args)
  {
    testSumOfSquares(1, 1);
    testSumOfSquares(2, 5);
    testSumOfSquares(3, 14);
    testSumOfSquares(4, 30);
    testSumOfSquares(5, 55);
  }
}
