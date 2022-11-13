/*

The program as you get it prints one star per proper divisor
of the number the user provides in the command line.

The proper divisors of a number are all divisors
except 1 and the number itself.

Observe that we use print and not println so that we do not
change line between stars.

Try the program with 10, 120 and 124
before you start with your task.

Your task is to modify the program so that instead it
prints one line with stars for the proper divisors
of each positive number smaller or equal than a bound
provided by the user in the command line.

Example:
java E9 10
1:
2:
3:
4: *
5:
6: **
7:
8: **
9: *
10: **

*/

public class E9 {
  public static void main(String[] args){
    int k = Integer.parseInt(args[0]);

    for (int i = 1; i<=k; i++){
      System.out.println("\n" + i + ": ");
      for (int j = 2; j < i; j++){
        if (i % j == 0){
          System.out.println("*");
        }
      }
    }
  }
}
