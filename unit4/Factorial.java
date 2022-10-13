//
// Factorial.java
//


class Factorial
{
    public static void testFactorial(int n, int expected)
    {
      int ans = factorial(n);

      System.out.print ("num: " + n + " expected: " + expected +
       " answer: " + ans);

      if (ans == expected)
        System.out.println (" CORRECT!");
      else
        System.out.println (" WRONG!");

    }

    public static int factorial(int n)
    {
      int ans = 1;

      if (n == 0)
        return ans;

      for (int i = 1; i <= n; i++)
        ans *= i;

      return ans;
    }

    public static void main(String[] args)
    {
        testFactorial(0, 1);
        testFactorial(1, 1);
        testFactorial(2, 2);
        testFactorial(3, 6);
        testFactorial(4, 24);
        testFactorial(5, 120);
        testFactorial(6, 720);
        testFactorial(7, 5040);
    }
}
