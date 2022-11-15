/*

The program takes an integer number N in the command line
and reads a sequence of integer numbers from standard input.
It prints how many times the number N occurs in the sequence.

Example showing how the program should behave.
The user provides 10 in the command line.
The sequence of numbers is provided from the keyboard.
Notice how the user  terminates input to the program
using Ctrl D (in a unix system) or Ctrl Z (iin a windows system).

The only output is the final message with the count.

java E2 10
1 3 10 2 10
2
3
10
^D
Number 10 occurred 3 times.

*/

/*
Your task is to complete the program after
  // Your code here
*/
import java.util.Scanner;

public class E2 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    Scanner data = new Scanner(System.in);

    int count = 0, L_data = 0;

    while (data.hasNext()) {
      L_data = data.nextInt();
      if (L_data == n) {
        count++;

      }
    }
    data.close();

    System.out.println("Number " + n + " occured " + count + " time.");

  }
}