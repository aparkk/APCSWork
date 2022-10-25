//
// MagicEightBall.java
//


public class MagicEightBall
{
  private final String reply1;
  private final String reply2;
  private final String reply3;


  public MagicEightBall()
  {
      reply1 = "Yes!";
      reply2 = "Nope!";
      reply3 = "Maybe!";

  }

  public String ask(String str)
  {
    if ((int) (Math.random() * 3) == 0)
      return reply1;

    if ((int) (Math.random() * 3) == 1)
      return reply2;

    return reply3;

  }
}
