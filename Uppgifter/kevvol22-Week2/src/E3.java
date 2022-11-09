/*
Sten-Sax-Paase:

The user inputs Rock, Scissors or Bag.
The program randomly chooses one of these:
   suggestion: use 0 for Rock, 1 for Scissors and 2 for Bag.

The program outputs what the user says, what the program says
and who wins:
    either "You win!" if the user wins
    or     "I win!" if  the program wins
    or     "We are even!" if both picked the same object.

To decide what to do depending on the user input use a switch statement on
the string userSays. There are three interesting cases:
    "Rock", "Scissors" and "Bag"
*/

public class E3{

  public static void main(String[] args) {
    String userSays = args[0];
    int programSays = (int) (Math.random() * 2);
    String message = "I don't know";

    // Your code here.

    String decoded = "";
    switch (programSays){
      case 0: decoded = "Rock"; break;
      case 1: decoded = "Scissors"; break;
      case 2: decoded = "Bag";  break;
      default:
    }

    String player2 = "";
    switch (player2){
      case 0: player2  = "Bag";  break;
      case 1: player2 = "Scissors";  break;
      case 2: player2 = "Rock";  break;
      default:
    }



    System.out.println("You say " + userSays);
    System.out.println("I say "   + decoded);
    System.out.println(message);

  }

}
