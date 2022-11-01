//
// Bouncing.java
//


import processing.core.*;
import java.util.*;

public class Bouncing extends PApplet
{
    public void settings()
    {
        size(900, 900);
    }

    public void setup()
    {
        balls = new ArrayList<Ball>();
        createBall();
    }

    public void createBall()
    {
        PVector position = new PVector(width / 2, height / 2);

        PVector velocity = PVector.random2D();
        velocity.setMag(random(3, 20));

        float radius = random(2, 15);
        int c = color(random(256), random(256), random(256));

        Ball ball = new Ball(this, position, velocity, radius, c);

        balls.add(ball);
    }

    public void draw()
    {
        background(0);
        
        for (Ball ball : balls)
            ball.display();
    }

    public void keyPressed()
    {
      if (key == RETURN || key == ENTER)
      {
        for (int i = 0; i < 15; i++)
            createBall();
      }
    }

    public static void main(String[] args)
    {
        PApplet.main("Bouncing");
    }

    private ArrayList<Ball> balls;
}
