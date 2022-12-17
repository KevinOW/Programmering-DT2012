public class DiceModel{
  // Instance variable
  private int dice;

  // Constructor:

  /*
    The constructor initialises the instance variable
    to a randominteger between 1 and 6.
  */
  public DiceModel(){
    // Generate a random number between 0 and 1 and scale it to the range 1-6
    this.dice = (int)(Math.random() * 6) + 1;
  }

  // Methods:

  /*
    The method roll sets the instance variable dice
    to a random integer between 1 and 6.
   */
  public void roll(){
    // Generate a random number between 0 and 1 and scale it to the range 1-6
    this.dice = (int)(Math.random() * 6) + 1;
  }

  /*
    The method read returns the number
    stored in the instance variable.
  */
  public int read(){
    // Return the current value of the dice instance variable
    return this.dice;
  }

  // Small test program
  public static void main(String[] args){
    int rolls = Integer.parseInt(args[0]);
    DiceModel d = new DiceModel();
    for (int i = 0; i < rolls ; i++ ) {
      d.roll();
      System.out.print(d.read() + " ");
    }
    System.out.println();

  }
}