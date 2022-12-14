/*
The program uses standard input to read
  two integers N and M
and
  N x M integers between 1 and 6.
(This is how the output of exercise E1 looks like:
    N was the number of trials and
    M was the number of dices used in each trial.
)

The program prints the sum of dices in a trial that occurrs more often
and how often it occurs.

Example:
java E6
5 3
1 2 3
2 3 4
4 3 2
3 4 5
5 6 6
The most frequent sum is 9
It occurrs 2 times.

Example using the output of E1 as standard input:
java E1 1000 3 | java E6
The most frequent sum is 9
It occurrs 128 times.

*/

/*
Your task is to complete the program.

Hint: Use an array where the indices are the possible sums
that can be achieved in a trial.
For example, if the simulation uses 3 dices the sum of the
three dices can be at most 18. For this case the program
can use an array with 19 places so that even place 18 exists.
In each place you can count how many times that value (the place)
occurs in the sequence of trials.

*/

import java.util.Scanner;

public class E6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int _t = input.nextInt();
    int _d = input.nextInt();
    input.close();

    int[] intArr = new int[6 * _d + 1];

    for (int i = 0; i < _t; i++) {
      int sum = 0;
      for (int j = 0; j < _d; j++) {
        int dice = (int) ((Math.random() * 6) + 1);
        sum += dice;
        System.out.print(dice + " ");
      }
      intArr[sum] += 1;
      System.out.println(" ");

    }
    int FreqSum = 0;
    for (int j = 0; j < intArr.length; j++) {
      if (intArr[j] > intArr[FreqSum]) {
        FreqSum = j;
      }
    }
    System.out.println("The most frequent sum is: " + FreqSum
        + "\nit occurs " + intArr[FreqSum] + " Times");
  }
}