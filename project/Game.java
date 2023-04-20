//
// Game.java
//


import processing.core.*;
import java.util.*;

public class Game extends PApplet
{
  public int gameScreen, character, score, highScore, newScore;
  public int pColor;
  public PImage img, oImg, oImg1, background, bg;
  public PFont font;
  public int b1, b2, y1, y2;

  public void settings()
  {
      fullScreen();
  }

  public void setup()
  {
    gameScreen = 0;
    character = 0;

    background = loadImage("background.jpeg");
    bg = loadImage("initial.jpg");
    oImg = loadImage("jellyfish.png");
    oImg1 = loadImage("jellyfish2.png");
    img = loadImage("spongebob.png");

    font = createFont("krabbypatty.ttf", 50);

    player = new Player(this, img);

    obstacles = new ArrayList<Obstacle>();
    createObstacle();
    b1 = color(55, 176, 201);
    b2 = color(25, 79, 144);
    y1 = color(247, 235, 98);
    y2 = color(187, 179, 34);
  }

  public void createObstacle()
  {
    PImage jf;
    int num = (int) (Math.random() * 2);
    if (num == 0) jf = oImg;
    else jf = oImg1;

    Obstacle o = new Obstacle(this, jf);

    obstacles.add(o);
  }

  public void draw()
  {
    imageMode(CORNERS);
    image(background, 0, -100);
    textFont(font);

    if (gameScreen == 0)
      playerScreen();
    else if (gameScreen == 1)
      gameScreen();
    else if (gameScreen == 2)
      gameOverScreen();
  }

  public void playerScreen()
  {
    imageMode(CORNERS);
    image(bg, 0, 0);
    textAlign(CENTER);
    textSize(100);
    fill(0);
    text("CHOOSE YOUR CHARACTER", width/2 - 15, 215);
    fill(y2);
    text("CHOOSE YOUR CHARACTER", width/2, 203);
    fill(y1);
    text("CHOOSE YOUR CHARACTER", width/2 - 9, 210);
    textSize(50);
    fill(150);
    text("use the RIGHT & LEFT ARROW keys to help", width/2 + 5, 350);
    text("press SPACE when you are ready", width/2 + 5, 425);
    fill(255);
    text("use the RIGHT & LEFT ARROW keys to help", width/2, 350);
    text("press SPACE when you are ready", width/2, 425);

    if (character == 0)
      img = loadImage("spongebob.png");
    else if (character == 1)
      img = loadImage("patrick.png");
    else if (character == 2)
      img = loadImage("squidward.png");
    else if (character == 3)
      img = loadImage("mrkrabs.png");
    else if (character == 4)
      img = loadImage("plankton.png");
    else if (character == 5)
      img = loadImage("sandy.png");
    else if (character == 6)
      img = loadImage("gary.png");
    else
      character = 0;

    imageMode(CENTER);
    image(img, width/2 - 200, height/2 + 150);

  }

  public void gameScreen()
  {
    score++;

    textAlign(CENTER);
    fill(b2);
    textSize(65);
    text("Score: "+ score, width/2, 200);

    textAlign(RIGHT);
    textSize(40);
    text("High Score: " + highScore, width - 50, 100);

    player.move();
    player.display();


    if(score > 0)
    {
      int a = 250;
      if((score % a == 0) || score % 75 == 0) createObstacle();

      for(Obstacle o: obstacles)
      {
        int n = (int)(Math.random()*3) + 1;
        o.pos.x -= n;
      }

      if(score > 500)
      {
        for(Obstacle o: obstacles)
        {
          int n = (int)(Math.random()*4) + 1;
          o.pos.x -= n;
        }

        if(score > 1000)
        {
          a = 200;
          if((score % a == 0) || score % 145 == 0 || score % 60 == 0) createObstacle();

          for(Obstacle o: obstacles)
          {
            int n = (int)(Math.random()*4) + 1;
            o.pos.x -= n;
          }

          if(score > 2000)
          {
            a = (int)(Math.random()*10) + 50;
            if((score % a == 0)) createObstacle();

            for(Obstacle o: obstacles)
            {
              int n = (int)(Math.random()*6) + 1;
              o.pos.x -= n;
            }

            if(score > 3000)
            {
              a = (int)(Math.random()*10) + 40;
              if((score % a == 0)) createObstacle();

              for(Obstacle o: obstacles)
              {
                int n = (int)(Math.random()*7) + 1;
                o.pos.x -= n;
              }

              if(score > 4500)
              {
                a = (int)(Math.random()*15) + 35;
                if((score % a == 0)) createObstacle();

                for(Obstacle o: obstacles)
                {
                  int n = (int)(Math.random()*9) + 1;
                  o.pos.x -= n;
                }
              }
            }
          }
        }
      }
    }

    for(Obstacle o : obstacles)
    {
      o.move();
      o.display();
      if(hits(o))
      {
        gameScreen = 2;
      }
    }

    if(highScore < score)
    {
      highScore = score;
    }
    newScore = score;
  }

  public void gameOverScreen()
  {
    player = new Player(this, img);
    obstacles = new ArrayList<Obstacle>();
    player.display();

    if(highScore < score)
    {
      highScore = score;
    }

    fill(255);
    fill(b2);
    textSize(40);
    textAlign(RIGHT);
    text("High Score: " + highScore, width - 50, 100);
    textAlign(CENTER);
    textSize(60);
    text("Score: " + newScore, width/2 + 500, 200);

    textAlign(CENTER);
    textSize(100);
    fill(0);
    text("GAME OVER", width/2 - 15, 215);
    fill(y2);
    text("GAME OVER", width/2, 203);
    fill(y1);
    text("GAME OVER", width/2 - 9, 210);

    textSize(45);
    fill(150);
    text("press SPACE to play again \nor \npress RETURN to choose a new character", width/2 + 5, 350);
    fill(255);
    text("press SPACE to play again \nor \npress RETURN to choose a new character", width/2, 350);

    score = 0;
  }


  public boolean hits(Obstacle o)
  {
    if (o.pos.x + 75 < player.pos.x) return false;
    if (o.pos.x > player.pos.x + player.width() - 75) return false;
    if (o.pos.y + 75 < player.pos.y) return false;
    if (o.pos.y > player.pos.y + player.height() - 75) return false;

    return true;
  }


  public void keyPressed()
  {
    if (keyCode == RIGHT) character+= 1;
    if (keyCode == LEFT) character-= 1;

    if (key == ENTER)
    {
      gameScreen = -1;
    }

    if (key == ' ')
    {
      if (gameScreen == 0 || gameScreen == 2)
      {
        gameScreen = 1;
        player = new Player(this, img);
      }

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
