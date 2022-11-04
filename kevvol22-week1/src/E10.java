/*

Add code to print
five uniform random values between 0 and 1,
their average value and
their minimum and maximum value.

Use Math.random(), Math.min(), and Math.max().

*/
public class E10{

  public static void main(String[] args) {

    // Your code here.

      int n = 5;
      double value1 = Math.random();
      double value2 = Math.random();
      double value3 = Math.random();
      double value4 = Math.random();
      double value5 = Math.random();

      double min = Math.min(value1, Math.min(value2, Math.min(value3,Math.min(value4, value5))));
      double max = Math.max(value1, Math.max(value2, Math.max(value3,Math.max(value4, value5))));
      double avg = (value1 + value2 + value3 + value4 + value5 / n);
      System.out.println("Avg.: " + avg);
      System.out.println("Min: " + min);
      System.out.println("Max: " + max);


  }

}
