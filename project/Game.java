//
// Game.java
//


import processing.core.*;
import java.util.*;

public class Game extends PApplet
{
  public int gameScreen;
  public int pColor;
  public void settings()
  {
      fullScreen();
  }

  public void setup()
  {
    gameScreen = -1;

    player = new Player(this, pColor);

    obstacles = new ArrayList<Obstacle>();
    createObstacle();
  }

  public void createObstacle()
  {
    int c = (int)color(random(256), random(256), random(256));
    Obstacle o = new Obstacle(this, c);
    obstacles.add(o);
  }

  public void draw()
  {
      background(0);
      stroke(255);
      strokeWeight(10);
      line(0, height - 180, width, height - 180);

      if (gameScreen == 0)
        initScreen();
      else if (gameScreen == 1)
        gameScreen();
      else if (gameScreen == 2)
        gameOverScreen();
      else if (gameScreen == -1)
        playerScreen();
  }

  public void playerScreen()
  {
    background(0);

    fill(255);

    textAlign(CENTER);
    textSize(50);
    text("Choose your player color", width/2, 100);

    textAlign(BASELINE);
    textSize(35);
    text("Press 1: Red", width/2 - 400, 250);
    text("Press 2: Orange", width/2 - 400, 350);
    text("Press 3: Yellow", width/2 - 400, 450);
    text("Press 4: Green", width/2 - 400, 550);
    text("Press 5: Blue", width/2 - 400, 650);

    text("Press 6: Purple", width/2 + 100, 250);
    text("Press 7: Pink", width/2 + 100, 350);
    text("Press 8: White", width/2 + 100, 450);
    text("Press 9: Gray", width/2 + 100, 550);
  }

  public void initScreen()
  {
    player = new Player(this, pColor);
    player.display();

    fill(255);
    textSize(30);
    text("Press SPACE to start !!", 400,200);
  }
  public void gameScreen()
  {
    player.move();
    player.display();

    if(random(1) < 0.009)
    {
      createObstacle();
    }

    for(Obstacle o : obstacles)
    {
      o.move();
      o.display();
      if(hits(o))
        gameScreen = 2;
    }
  }

  public void gameOverScreen()
  {
    player = new Player(this, pColor);
    obstacles = new ArrayList<Obstacle>();

    player.display();
    textSize(45);
    textAlign(CENTER);
    text("GAME OVER!", width/2, 200);
    textSize(30);
    text("Press SPACE to play again or RETURN to choose a new color!!", width/2, 300);
  }


  public boolean hits(Obstacle o)
  {
    if (player.pos.x + 50 >= o.pos.x && player.pos.x <= o.pos.x + 35 &&
    player.pos.y + 50 >= o.pos.y && player.pos.y <= o.pos.y + 45)
      return true;
      return false;
  }

  public void keyPressed()
  {
    if (key == '1')
    {
      pColor = color(255, 0, 0);
      gameScreen = 0;
    }
    if (key == '2')
    {
      pColor = color(255, 100, 0);
      gameScreen = 0;
    }
    if (key == '3')
    {
      pColor = color(255, 255, 0);
      gameScreen = 0;
    }
    if (key == '4')
    {
      pColor = color(0, 255, 0);
      gameScreen = 0;
    }
    if (key == '5')
    {
      pColor = color(0, 0, 255);
      gameScreen = 0;
    }
    if (key == '6')
    {
      pColor = color(175, 50, 255);
      gameScreen = 0;
    }
    if (key == '7')
    {
      pColor = color(255, 0, 255);
      gameScreen = 0;
    }
    if (key == '8')
    {
      pColor = color(255);
      gameScreen = 0;
    }
    if (key == '9')
    {
      pColor = color(150);
      gameScreen = 0;
    }

    if (key == ENTER)
    {
      gameScreen = -1;
    }

    if (key == ' ')
    {
      if (gameScreen == 0 || gameScreen == 2)
        gameScreen = 1;
      player.jump();
    }
  }

  public static void main(String[] args)
  {
      PApplet.main("Game");
  }

  private Player player;
  private ArrayList<Obstacle> obstacles;
}
