/*

Add code that prints the Fibonacci words of order 0 through 10.
The words are as follows:
word of order 0 = "a",
word of order 1 = "b",
word of order 2 = "ba",
word of order 3 = "bab",
word of order 4 = "babba",
and in general
word of order n = word of order (n -1) followed by word of order (n-2).

Use string concatenation.
Use several statements to build up the strings and print all 11 words.

*/

public class Bonus{

  public static void main(String[] args) {
    // Your code here.
    String x, y, z,w1,w2,w3,w4,w5,w6,w7, w8;
    x = "a";
    y = "b";
    z = y+x;
    w1 = z+y;
    w2 = w1+z;
    w3 = w2+w1;
    w4 = w3+w2;
    w5 = w4+w3;
    w6 = w5+w4;
    w7 = w6+w5;
    w8 = w7+w6;

    System.out.println(
            "word 0: " + x
           + "\nword 1: " + y
            + "\nword 2: " + z
            + "\nword 3: " + w1
            + "\nword 4: " + w2
            + "\nword 5: " + w3
            + "\nword 6: " + w4
            + "\nword 7: " + w5
            + "\nword 8: " + w6
            + "\nword 9: " + w7
            + "\nword 10: " + w8
    );
  }
}
