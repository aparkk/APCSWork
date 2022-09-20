//
// FibonacciRatios.java
//

public class FibonacciRatios
{
  public static void main(String[] args)
  {
    int a = 1;
    int b = 1;
    System.out.println(b / a);

    for (int i = 0; i < 30; i++)
    {
        b += a;
        a = b - a;

        System.out.println((double) b / a);
    }
  }
}
