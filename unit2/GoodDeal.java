//
// GoodDeal.java
//


public class GoodDeal
{
    public static void testGoodDeal(double originalPrice, double salePrice)
    {
        System.out.println ("original price = $" + originalPrice + ", sale price = $"
        + salePrice + ": good deal? " + goodDeal(originalPrice, salePrice));
    }

    public static boolean goodDeal(double originalPrice, double salePrice)
    {
      if (salePrice < 0.75 * originalPrice)
        return true;

      return false;
    }

    public static void main(String[] args)
    {
        testGoodDeal(100, 60);
        testGoodDeal(120, 100);
        testGoodDeal(25, 5);
    }
}
