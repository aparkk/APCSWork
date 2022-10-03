//
// IcyHot.java
//


class IcyHot
{
    public static void testIcyHot(int temp1, int temp2)
    {
        System.out.println ("temp1 = " + temp1 + ", temp2 = " + temp2
         + ": " + icyHot(temp1, temp2));
    }

    public static boolean icyHot(int temp1, int temp2)
    {}
      if (temp1 < 0 && temp2 > 100)
        return true;

      if (temp1 > 100 && temp2 < 0)
        return true;

      return false;
    }

    public static void main(String[] args)
    {
        testIcyHot(120, -1);
        testIcyHot(-1, 120);
        testIcyHot(2, 120);
    }
}
