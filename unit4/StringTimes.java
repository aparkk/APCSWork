//
// StringTimes.java
//


class StringTimes
{
  public static void testStringTimes(String str, int n, String expected)
  {
    String ans = stringTimes(str, n);

    System.out.print ("string: " + str + " n: " + n + " expected: " + expected +
     " answer: " + ans);

    if (ans.equals(expected))
      System.out.println (" CORRECT!");
    else
      System.out.println (" WRONG!");

  }

  public static String stringTimes(String str, int n)
  {
    if (n == 0)
      return "";

    String ans = str;

    for (int i = 1; i < n; i++)
      ans += str;

    return ans;
  }

  public static void main(String[] args)
  {
    testStringTimes("Hi", 2, "HiHi");
    testStringTimes("Hi", 3, "HiHiHi");
    testStringTimes("Hi", 1, "Hi");
  }
}
