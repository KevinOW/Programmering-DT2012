
/*
The class Picture has to be in the same directory as this program.
It is included in the zip file.

The program reads two integer values w and h from the command line
and creates a picture of size w x h with random colors.

A random color is a color with random red, green and blue components.

The program ends by showing the picture in a window.

More details about the output in the PDF file with explanations for each exercise.
*/
import java.awt.Color;

public class E4 {
  public static void main(String[] args) {
    int width = Integer.parseInt(args[0]);
    int height = Integer.parseInt(args[1]);
    Picture _pic = new Picture(width, height);
    for (int col = 0; col < width; col++) {
      for (int row = 0; row < height; row++) {
        _pic.set(col, row, new Color(((int) (Math.random() * 255) + 1), ((int) (Math.random() * 255) + 1),
            ((int) (Math.random() * 255) + 1)));
      }
      _pic.show();
    }
  }
}
