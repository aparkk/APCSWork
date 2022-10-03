//
// PrimeNum.java
//


public class PrimeNum
{
    public static void testIsPrime(int n)
    {
        System.out.println (n + " is prime? " + isPrime(n));
    }

    public static boolean isPrime(int n)
    {
      for (int i = 2; i * i <= n; i++)
      {
        if (n % i == 0)
          return false;
      }

      return true;
    }

    public static void main(String[] args)
    {
        testIsPrime(13);
        testIsPrime(100);
        testIsPrime(97);
    }
}
