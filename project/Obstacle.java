//
// Obstacle.java
//


import processing.core.*;

public class Obstacle
{
  public PVector pos;
  public float r;
  public int num;
  public PImage img;

  public Obstacle(PApplet o, PImage img)
  {
    this.o = o;
    this.img = img;
    r = 255;
    num = (int)(Math.random()*300 + 100);
    pos = new PVector(o.width, o.height - r - num);
  }

  public void move()
  {
    pos.x -= 11;
  }

  public void display()
  {
    o.image(img, pos.x, pos.y);
  }

  private PApplet o;
}
