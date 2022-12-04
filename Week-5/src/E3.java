/*
The program demonstrates a color and its complement.
It uses a static method
   complement
and draws a square with the original color and a smaller overlapped square
with the complement.

Your task is to complete the method
      complement.
*/
import java.awt.Color;

public class E3 {

  /*
   * The method returns a color where each component is calculated
   * as 255 - the corresponding component of the argument.
   */
  public static Color complement(Color c) {

    return new Color(255 - c.getRed(),
        255 - c.getGreen(),
        255 - c.getBlue());
  }

  /*
   * Demonstrates the complement of the color given by three integers.
   * The three integers should be provided in the command liner
   */
  public static void main(String[] args) {
    int Red = Integer.parseInt(args[0]);
    int Green = Integer.parseInt(args[1]);
    int Blue = Integer.parseInt(args[2]);

    Color col = new Color(Red, Green, Blue);
    StdDraw.setPenColor(col);
    StdDraw.filledSquare(0.5, 0.5, 0.25);
    StdDraw.setPenColor(complement(col));
    StdDraw.filledSquare(0.5, 0.5, 0.125);
  }

}
