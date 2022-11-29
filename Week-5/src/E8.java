/*
The program reads five command line arguments:
   - The name of a file from the command line.
     The file should be a PNG, GIF, or JPEG file containing an image.
   - An integer indicating a number of pixels
   - Three integers in the range [0, 255] indicating the three
     components of a color.

The program creates a Picture with the image in the file and draws
a frame (ram på svenska) over the border pixels of the image.
The color of the frame is the color with components given in the
command line. The thickness of the frame is the number of pixels
given in the command line.

The program shows the framed image in a window.

Your task is to complete the program.

*/
import java.awt.Color;

public class E8 {

  public static void main(String[] args) {
    String fileName = args[0];
    int borderPx = Integer.parseInt(args[1]);
    int red = Integer.parseInt(args[2]);
    int green = Integer.parseInt(args[3]);
    int blue = Integer.parseInt(args[4]);
    Picture p = new Picture(fileName);

    for (int i = 0; i < borderPx; i++) {
      for (int j = 0; j < p.height(); j++) {
        Color c = new Color(red, green, blue);
        p.set(i, j, c);
      }
    }

    for (int i = 0; i < p.width(); i++) {
      for (int j = 0; j < borderPx; j++) {
        Color c = new Color(red, green, blue);
        p.set(i, j, c);
      }
    }

    for (int i = p.height() - borderPx; i < p.height(); i++) {
      for (int j = 0; j < p.width(); j++) {
        Color c = new Color(red, green, blue);
        p.set(i, j, c);
      }
    }

    for (int i = 0; i < p.height(); i++) {
      for (int j = p.width() - borderPx; j < p.width(); j++) {
        Color c = new Color(red, green, blue);
        p.set(i, j, c);
      }
    }

    p.show();
  }
}
