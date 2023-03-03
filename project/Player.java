//
// Player.java
//


import processing.core.*;

public class Player
{
  public PVector pos, vel, gravity;
  public float r;
  public int c;

  public Player(PApplet p, int c)
  {
    this.p = p;
    this.c = c;
    r = 185;
    pos = new PVector(50, p.height - r);
    vel = new PVector(0, 0);
    gravity = new PVector(0, 2);
  }

  public void jump()
  {
    vel.y = -35;
  }

  public void move()
  {
    pos.y += vel.y;
    vel.y += gravity.y;
    pos.y = p.constrain(pos.y, 0, p.height - r);
  }

  public void display()
  {
    p.fill(c);
    p.stroke(c);
    p.strokeWeight(2);
    p.rect(pos.x, pos.y - 100, 75, 100);
  }

  private PApplet p;
}
