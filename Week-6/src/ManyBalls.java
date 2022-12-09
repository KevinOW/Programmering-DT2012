import java.util.Scanner;
import java.util.Locale;
import java.awt.Color;
public class ManyBalls{

  /*
  Exercise 3:
  Complete the definition of nextBall to read 8 numbers from the argument data:
    1) the x-value for the center of a ball (a double)
    2) the y-value for the center of a ball (a double)
    3) the radies of a ball (a double)
    4,5,6) the red, green and blue components of a color (integers)
    7) the x-value of the velocity of a ball (a double)
    8) the y-value of the velocity of a ball (a double)
   and return a bouncing ball described by these values.
  */
  public static BouncingBall nextBall(Scanner data){
    // Read the x-value for the center of the ball
    double x = data.nextDouble();
    // Read the y-value for the center of the ball
    double y = data.nextDouble();
    // Read the radius of the ball
    double radius = data.nextDouble();
    // Read the red, green, and blue components of the color
    int red = data.nextInt();
    int green = data.nextInt();
    int blue = data.nextInt();
    // Read the x-value of the velocity
    double vx = data.nextDouble();
    // Read the y-value of the velocity
    double vy = data.nextDouble();

    // Create a color object from the red, green, and blue values
    Color color = new Color(red, green, blue);

    // Construct and return a BouncingBall object with the given values
    return new BouncingBall(x, y, radius, color, vx, vy);
  }

  /*
    Exercise 4:
    Complete the definition of readAll using nextBall n times
    and return an array with the n bouncing balls.
  */
  public static BouncingBall[] readAll(Scanner data, int n){
      // Your code here.
      return null;
  }



  /*
    Exercise 5:
    Complete the definition of drawAll that draws all the bouncing balls in
    the array balls.
  */
  public static void drawAll(BouncingBall[] balls){
    // Your code here.
  }

  /*
    Exercise 6:
    Complete the definition of moveAll that moves all the bouncing balls in
    the array balls in a square world [-bound, bound]
    Moving a ball involves bouncing if the ball collides and then using the
    method move.
  */
  public static void moveAll(BouncingBall[] balls, int bound){
    // Your code here.
  }



  /*
  The definition of main is NOT an exercise:
  it is a test for your solutions to the exercises above.

  A client program that animates n balls.
  The balls live in a square world [-10,10]
  The program reads the data for each ball from standard input.

  Try the program redirecting standard input to a file.
  Use for example the result of generating 30 random balls with

  java RandomBalls 30 10 > 30balls

  using

  java ManyBalls 30 < 30balls

  Or, better

 java RandomBalls 30 10 | java 30

  */
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    Scanner data = new Scanner(System.in).useLocale(Locale.US);
    BouncingBall[] balls = readAll(data,n);

    StdDraw.enableDoubleBuffering();
    StdDraw.setXscale(-10,10);
    StdDraw.setYscale(-10,10);
    while (true)  {
      moveAll(balls, 10);
      StdDraw.clear();
      drawAll(balls);
      StdDraw.show();
      StdDraw.pause(20);
    }
  }
}
