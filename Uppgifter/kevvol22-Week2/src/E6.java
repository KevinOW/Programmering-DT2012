/*

The program prints the first (positive) odd numbers.
The bound saying how many odd numbers are printed is given
as a command line argument.
The bound can be any non-negative number.

*/

public class E6{

  public static void main(String[] args) {
      int bound = Integer.parseInt(args[0]);
      System.out.println("The first " + bound + " odd numbers are:");
      // your code here
      for (int i = 1; i <= bound; i++ )
          System.out.println((i*2)-1);
  }

}
