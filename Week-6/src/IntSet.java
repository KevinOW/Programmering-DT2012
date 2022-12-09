/*
  This is the Bonus exercise.
  Complete the implementation of the abstract data type IntSet.
  The values are sets of non negative integers upto an upper bound.

  Examples of values for set of non-negative integers upto 10000 are
       {0, 10, 1102}
       {2, 5, 7, 11}
       {}

  The operations we want to do are:
       add an element (an integer that is between 0 and the bound)
       test whether an integer between 0 and the bound belongs to the set

  For the implementation use an array of booleans with indices 0 .. bound
  (length is bound + 1). The possible elements of the set are the indices
  of the array. A value true for an index X means that X is in the set.

  Below you see the API. We include two constructors:
        one for the empty set
        one for a set where the elements are given in an array of integers

  In all cases you can assume that the integer values provided as arguments
  are in the correct range.

*/

public class IntSet {
  /*
  Your code here: instance variables
  */
    boolean[] array;
    int bound;

    public IntSet(int n){
        // Your code here: constructor for the empty set of positive integers
        // between 0 and n.
        array = new boolean[n+1];
        bound = array.length - 1;
    }

    public IntSet(int n, int[] values){
        // Your code here: constructor for the set of positive integers
        // between 0 and n
        // with the members  provided by the array values.
        array = new boolean[n+1];
        for (int i = 0; i < values.length; i++) {
            array[values[i]] = true;
        }
        bound = array.length - 1;
    }

    public boolean has(int x){
        if (x > 0 && x <= bound) {
            return array[x];
        }
        return false;
        // Your code here: tests whether the integer x belongs to this set.
    }

    public void addValue(int x){
        if (x > 0 && x <= bound) {
            array[x] = true;
        }

        // Your code here: adds the element x to this set.
    }

    public String toString(){
        String string = "{ ";
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                string += Integer.toString(i);
                string += " ";
            }
        }
        string += "}";
        // Your code here: returns a String version of this set.
        return string;
    }

    public static void main(String[] args){
        IntSet intSet = new IntSet(5);
        intSet.addValue(2);
        intSet.addValue(4);
        intSet.addValue(6);
        System.out.println("intSet contains 2: " + intSet.has(2));
        System.out.println("intSet contains 1: " + intSet.has(1));
        System.out.println("intSet contains 6: " + intSet.has(6));
        System.out.println(intSet);

        // Your code here: a small test of operations of IntSet.
    }
}