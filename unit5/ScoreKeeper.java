//
// ScoreKeeper.java
//


public class ScoreKeeper
{
  private int score;

  public ScoreKeeper()
  {
    score = 0;
  }

  public int getScore()
  {
    return score;
  }

  public void scoreNormal()
  {
    score += 100;
  }

  public void scoreBonus()
  {
    score += 1000;
  }
}
