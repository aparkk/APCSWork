//
// CoinFlip.java
//


public class CoinFlip
{
  public static String coinFlip()
  {
    if (Math.random() < 0.5)
      return "Heads";

    return "Tails";
  }

  public static void main(String[] args)
  {
    for (int i = 0; i < 10; i++)
      System.out.println(coinFlip());
  }
}
