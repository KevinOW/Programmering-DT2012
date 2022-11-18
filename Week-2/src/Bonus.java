/*
(This is an exercise taken from the course book)

The Universal Product Code (UPC) is a 12 digit code
that uniquely specifies a product.

The least significant digit d1(rightmost one) is a check digit
which is the uniquely determined by making the following expression
a multiple of 10:

(d1 + d3 + d5 + d7 + d9 + d11) + 3 (d2 + d4 + d6 + d8 + d10 + d12)

As an example, the check digit corresponding to
   0-48500-00102 (Tropicana Pure Premium Orange Juice) is 8 since

(8 + 0 + 0 + 0 + 5 + 4) + 3 (2 + 1 + 0 + 0 + 8 + 0) = 50

and 50 is a multiple of 10.

Write a program that reads in a 11 digit integer
from a command line parameter,
computes the check digit,
and prints the the full UPC.

Hint: use a variable of type long to store the 11 digit number.

*/

public class Bonus {

  public static void main(String[] cmdLn) {
    long upc = Long.parseLong(cmdLn[0]);
    int sum = 0;
    String input = cmdLn[0];
    for (int i = 2; i <= 12; i++) {
      double v = (upc / Math.pow(10, i - 2)) % 10;
      if (i % 2 == 0) {
        sum += 3 * (int) v;
      } else {
        sum += (int) v;
      }
    }
    int upcFinal = 10 - (sum % 10);
    System.out.println("The full UPC is: " + input + "\n" + "The check digit is: " + upcFinal);

  }
}