//
// Obstacle.java
//


import processing.core.*;

public class Obstacle
{
  public PVector pos;
  public float r;
  public int c;

  public Obstacle(PApplet o, int c)
  {
    this.o = o;
    this.c = c;
    r = 185;
    pos = new PVector(o.width, o.height - r);
  }

  public void move()
  {
    pos.x -= 11;
  }

  public void display()
  {
    o.fill(c);
    o.stroke(c);
    o.rect(pos.x, pos.y - 55, 35, 55);
  }

  private PApplet o;
}
