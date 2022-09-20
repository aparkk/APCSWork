//
// Fibonacci.java
//

public class Fibonacci
{
  public static void main(String[] args)
  {
    int a = 1;
    int b = 1;

    System.out.println(a);
    System.out.println(b);

    for (int i = 0; i < 30; i++)
    {
        System.out.println(a + b);

        b += a;
        a = b - a;
    }
  }
}
