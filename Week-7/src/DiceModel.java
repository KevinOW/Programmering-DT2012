public class DiceModel{
  private int dice;

  public DiceModel(){
    this.dice = (int)(Math.random() * 6) + 1;
  }

  public void roll(){
    this.dice = (int)(Math.random() * 6) + 1;
  }

  public int read(){
    return this.dice;
  }

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