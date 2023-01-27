//
// Arrays.java
//


public class Arrays
{
  public static void main(String[] args)
  {
    //10x10 array
    int[][] a = new int[10][10];

    for (int i = 0; i < 10; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        if(i == j) a[i][j] = 1;
        else a[i][j] = 0;
      }
    }

    for (int i = 0; i < 10; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    //String array
    System.out.println();

    String[][] b = {{"Ava", "Alex"},{"Allison", "Andrew"}};

    for (int i = 0; i < 2; i++)
    {
      for (int j = 0; j < 2; j++)
      {
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }

    //5x5 double array
    System.out.println();

    double[][] c = new double[5][5];
    int n = 10;

    for (int i = 0; i < 5; i++)
    {
      for (int j = 0; j < 5; j++)
      {
        c[i][j] = n * (i + 1) + j + 1;
      }
    }

    for (int i = 0; i < 5; i++)
    {
      for (int j = 0; j < 5; j++)
      {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }

    //6x5 integer array
    System.out.println();

    int[][] d = new int[6][5];

    for (int i = 0; i < 6; i++)
    {
      for (int j = 0; j < 5; j++)
      {
        d[i][j] = i + 1;
      }
    }

    for (int i = 0; i < 6; i++)
    {
      for (int j = 0; j < 5; j++)
      {
        System.out.print(d[i][j] + " ");
      }
      System.out.println();
    }
  }
}
