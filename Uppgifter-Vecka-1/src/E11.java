/*

Add code to
  read three int values from the command line and
  print them in ascending order.

Use Math.min() and Math.max().

*/

public class E11{

  public static void main(String[] args) {

    // Your code here.
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int z = Integer.parseInt(args[2]);

    int a = Math.min(x,y);
    int b = Math.max(x,y);
    int min = Math.min(a,z);
    int max = Math.max(b,z);
    int median = x + y + z - min - max;

    System.out.println(min);
    System.out.println(median);
    System.out.println(max);


  }

}
