/*
The program generates a random integer in the interval 1-10
(including both 1 and 10).

The user runs the program guessing what the computer generates
using the command line argument.

If the user guessed the number generated by the program
the program outputs "Well done!"

Otherwise the program outputs: "Play once more!"
meaning that the user can run the program once more

*/

public class E2{

  public static void main(String[] args) {
    int programGuess = 0;
    int userSays = Integer.parseInt(args[0]);

    // your code here
    int min = 1;
    int max = 10;
    for (int i = 0; i < 1; i++){
      programGuess = (int)(Math.random()*(max-min)) + min;
      System.out.println(programGuess);
    }

    if (programGuess == userSays)  {
      System.out.println("Well done!");
    }
    else {
      System.out.println("Play once more!");
    }

  }

}
