//
// Ball.java
//


import processing.core.*;

public class Ball
{
  public Ball(PApplet b, PVector p, PVector v, float r, int c)
  {
    this.b = b;
    this.p = p;
    this.v = v;
    this.r = r;
    this.c = c;
  }

  public void display()
  {
    b.fill(c);
    b.ellipse(p.x, p.y, r * 2, r * 2);

    p.add(v);

    if (p.x < r || p.x > b.width - r)
      v.x *= -1;

    if (p.y < r || p.y > b.height - r)
      v.y *= -1;
  }

  private PApplet b;
  private PVector p;
  private PVector v;
  private float r;
  private int c;
}
