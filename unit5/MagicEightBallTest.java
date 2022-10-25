//
// MagicEightBallTest.java
//


public class MagicEightBallTest
{
  public static void main(String[] args)
  {
    MagicEightBall ball = new MagicEightBall();

    System.out.println("question: " + "Do I have homework tonight? "
    + ball.ask("Do I have homework tonight?"));

    System.out.println("question: " + "Do I have school? "
    + ball.ask("Do I have school?"));

    System.out.println("question: " + "Is this working? "
    + ball.ask("Is this working?"));

    System.out.println("question: " + "Have you ever lied? "
    + ball.ask("Have you ever lied?"));

    System.out.println("question: " + "Do you have pets? "
    + ball.ask("Do you have pets?"));

    System.out.println("question: " + "Do you like me? "
    + ball.ask("Do you like me?"));
  }
}
