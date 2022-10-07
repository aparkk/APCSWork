//
// GoodDeal.java
//


public class GoodDeal
{
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected)
    {
      boolean ans = goodDeal(originalPrice, salePrice);

      System.out.print ("original price: $" + originalPrice + " sale price: $" +
      salePrice + " good deal (expected): " + expected +
       " good deal (actual): " + ans);

      if (ans == expected)
        System.out.println (" CORRECT!");
      else
        System.out.println (" WRONG!");
    }

    public static boolean goodDeal(double originalPrice, double salePrice)
    {
      if (salePrice < 0.75 * originalPrice)
        return true;

      return false;
    }

    public static void main(String[] args)
    {
        testGoodDeal(100, 60, true);
        testGoodDeal(120, 100, false);
        testGoodDeal(25, 5, true);
    }
}
