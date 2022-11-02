/*

Add code that prints two numbers that represent the outcome of
throwing 2 dices.

Use Math.random in order to achieve a randomized behaviour.

*/

public class E9{

  public static void main(String[] args) {

    // Your code here
    int dice1;
    int dice2;
    int totalSum;
    dice1 = (int)(Math.random()*6) + 1;
    dice2 = (int)(Math.random()*6) + 1;
    totalSum = dice1 + dice2;

    System.out.println("The first die comes up to " + dice1);
    System.out.println("The first die comes up to " + dice2);
    System.out.println("Your total roll is " + totalSum);

  }

}
