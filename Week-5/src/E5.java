/*
The program reads the name of a file from the command line.
The file should be a PNG, GIF, or JPEG file containing an image.

The program creates a Picture with the image in the file,
inverts the image vertically and shows the inverted image
in a window.

More about the output can be found in the PDF with explanations.

*/
public class E5 {
  public static void main(String[] args) {
    Picture source = new Picture(args[0]);
    int width = source.width();
    int height = source.height();
    Picture target = new Picture(width, height);
    for (int col = 0; col < width; col++)
      for (int row = 0; row < height; row++)
        target.set(col, height - row - 1, source.get(col, row));
    target.show();
  }
}
