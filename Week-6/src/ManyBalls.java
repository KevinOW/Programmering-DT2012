import java.util.Scanner;
import java.util.Locale;
import java.awt.Color;

public class ManyBalls {

  /*
   * Exercise 3:
   * Complete the definition of nextBall to read 8 numbers from the argument data:
   * 1) the x-value for the center of a ball (a double)
   * 2) the y-value for the center of a ball (a double)
   * 3) the radies of a ball (a double)
   * 4,5,6) the red, green and blue components of a color (integers)
   * 7) the x-value of the velocity of a ball (a double)
   * 8) the y-value of the velocity of a ball (a double)
   * and return a bouncing ball described by these values.
   */
  public static BouncingBall nextBall(Scanner data) {
    double x = data.nextDouble();
    double y = data.nextDouble();
    double r = data.nextDouble();
    int red = data.nextInt();
    int green = data.nextInt();
    int blue = data.nextInt();
    double velx = data.nextDouble();
    double vely = data.nextDouble();
    Color c = new Color(red, green, blue);
    BouncingBall ball = new BouncingBall(x, y, r, c, velx, vely);
    return ball;
  }

  /*
   * Exercise 4:
   * Complete the definition of readAll using nextBall n times
   * and return an array with the n bouncing balls.
   */
  public static BouncingBall[] readAll(Scanner data, int n) {
    BouncingBall[] balls = new BouncingBall[n];
    for (int i = 0; i < n; i++) {
      balls[i] = nextBall(data);
    }
    return balls;
  }

  /*
   * Exercise 5:
   * Complete the definition of drawAll that draws all the bouncing balls in
   * the array balls.
   */
  public static void drawAll(BouncingBall[] balls) {
    for (int i = 0; i < balls.length; i++) {
      balls[i].draw();
    }
  }

  public static void moveAll(BouncingBall[] balls, int bound) {
    for (int i = 0; i < balls.length; i++) {
      balls[i].move();
      if (balls[i].collideX(bound) || balls[i].collideX(-bound)) {
        balls[i].bounceX();
      }
      if (balls[i].collideY(bound) || balls[i].collideY(-bound)) {
        balls[i].bounceY();
      }
    }

  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    Scanner data = new Scanner(System.in).useLocale(Locale.US);
    BouncingBall[] balls = readAll(data, n);

    StdDraw.enableDoubleBuffering();
    StdDraw.setXscale(-10, 10);
    StdDraw.setYscale(-10, 10);
    while (true) {
      moveAll(balls, 10);
      StdDraw.clear();
      drawAll(balls);
      StdDraw.show();
      StdDraw.pause(20);
    }
  }
}