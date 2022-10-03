//
// Makes10.java
//


class Makes10
{
    public static void testMakes10(int a, int b)
    {
        System.out.println(a + ", " + b + ": " + makes10(a, b));
    }

    public static boolean makes10(int a, int b)
    {
      if (a == 10 || b == 10 || a + b == 10)
        return true;

      return false;
    }

    public static void main(String[] args)
    {
        testMakes10(9, 10);
        testMakes10(9, 9);
        testMakes10(1, 9);
    }
}
