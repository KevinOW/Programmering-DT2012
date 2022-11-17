/*
The program reads a sequence of integers and prints back out
the integers to standard output, except that it excludes repeated
values that appear consecutively.

For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1,
your program should print out 1 2 1 5 1 7 1.

*/

/*

Your task is to complete the program after
 // Your code here

 ** Optional: **
 ***************
 If the user presses Ctrl D without providing any numbers the program
 has nothing to do: there should be no output and the program should
 terminate quitely.

  Make sure your program has this behaviour.
*/

import java.util.Scanner;

public class E4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int p_digit = 0, count = 0;
    int[] _arrayList = new int[20];

    while (input.hasNext()) {
      int n = input.nextInt();

      if (n == p_digit) {
      } else {
        _arrayList[count] = n;
        count++;
      }
      p_digit = n;
    }
    input.close();
    for (int i = 0; i < count; i++) {
      System.out.print(_arrayList[i] + " ");
    }

  }
}