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
    int i = Integer.parseInt(userSays);

    int programSays = (int) (Math.random() * 3);

    String decoded = switch (programSays) {
      case 0 -> "Rock";
      case 1 -> "Scissors";
      case 2 -> "Paper";
      default -> "";
    };

    if (i == 0){
      System.out.println("You say: Rock");
    }else if (i == 1){
      System.out.println("You say: Scissors");
    }else if (i == 2) {
      System.out.println("You say: Paper");
    }else
      System.out.println("Not a valid input! Try Again");

    System.out.println("Computer say: " + decoded);

    if (programSays == i){
      System.out.println("It's a tie!");
    } else if (i < programSays) {
      System.out.println("User wins!");
    } else {
      System.out.println("Computer wins!");
    }
  }
}
