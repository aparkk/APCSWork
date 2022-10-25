//
// ScoreKeeperTest.java
//


public class ScoreKeeperTest
{
  public static void testScore(ScoreKeeper score, int expected)
  {
    int actual = score.getScore();

    System.out.println( "\nexpected total: " + expected +
    "\nactual total: " + actual);

    if (expected == actual)
      System.out.println("yay <3 !!");
    else
      System.out.println("wrong </3 !");
  }

  public static void main(String[] args)
  {
    ScoreKeeper score = new ScoreKeeper();

    score.scoreNormal();
    score.scoreNormal();
    score.scoreBonus();
    score.scoreBonus();
    System.out.println("score: " + score.getScore());

    ScoreKeeper score2 = new ScoreKeeper();

    score2.scoreNormal();
    score2.scoreBonus();
    score2.scoreBonus();
    System.out.println("score2: " + score2.getScore());


    testScore(score, 2200);
    testScore(score2, 2100);

  }
}
