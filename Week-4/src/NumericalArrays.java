/*
The class NumericalArrays is a library of methods that support programming
with arrays of numbers. It includes methods for  printing arrays,
creating arrays and doing mathematical operations with arrays.

Each of the methods is explained with a comment directly above the header of
the method.

Last in the class there is a method main that calls on all the methods to
showcase how they can be used.

Your task is to complete the implementation of all methods except linspace and main.

If you have solved the Bonus exercise you should also add code to main
to showcase the function on the array {1,2,3,4,5,6,7,8,9,10} with a
window of 3.

*/
public class NumericalArrays {
    /*
     * Takes arguments start and stop (both doubles) with start <= stop
     * and n (an integer) with n > 0.
     * Returns n evenly spaced samples (doubles),
     * calculated over the interval [start, stop].
     */
    public static double[] linspace(double start, double stop, int n) {
        double[] lsp = new double[n];
        for (int i = 0; i < n; i++) {
            lsp[i] = start + i * Math.abs(stop - start) / (n - 1);
        }
        return lsp;
    }

    /*
     * Prints the elements of an array of doubles to standard output.
     * The argument is an array of doubles.
     * The elements are printed on one line separated by a white space
     * A new line is introduced to standard output after the last element.
     */
    public static void println(double[] NumArray) {
        for (int i = 0; i < NumArray.length; i++) {
            System.out.print(NumArray[i] + " ");
        }
        System.out.println();
    }

    /*
     * Prints the elements of an array of integers to standard output.
     * The argument is an array of integers.
     * The elements are printed on one line separated by a white space
     * A new line is introduced to standard output after the last element.
     */
    public static void println(int[] NumArray) {
        for (int i = 0; i < NumArray.length; i++) {
            System.out.print(NumArray[i] + " ");
        }
        System.out.println();
    }

    /*
     * Takes 2 integer arguments, a and b, with a <= b.
     * Returns an array of integers with all the values in [a,b].
     */
    public static int[] range(int a, int b) {
        int[] secure = new int[0];
        if (a <= b) {
            int[] range = new int[b - a + 1];
            for (int i = a; i <= b; i++) {
                range[i - a] = i;
            }
            return range;
        } else {
            return secure;
        }
    }

    /*
     * Takes 2 integer arguments, n and a with n > 0.
     * Returns the array of integers of length n with value a in all positions.
     */
    public static int[] repeat(int n, int a) {
        int[] nTimes = new int[n];
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                nTimes[i] = a;
            }
        }
        return nTimes;
    }

    /*
     * Returns the smallest value in the array of doubles it gets as argument.
     */
    public static double min(double[] NumArray) {
        double[] arr = new double[NumArray.length];
        double min = arr[0];
        for (int i = 0; i < NumArray.length; i++) {
            arr[i] = NumArray[i];
            if (arr[0] < min)
                ;
            {
                min = arr[0];
            }
        }
        return min;
    }

    /*
     * Returns the largest value in in the array of doubles it gets as argument.
     */
    public static double max(double[] NumArray) {
        double[] arr = new double[NumArray.length];
        double max = arr[0];
        for (int i = 0; i < NumArray.length; i++) {
            arr[i] = NumArray[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
     * Returns the smallest value in in the array of ints it gets as argument.
     */
    public static int min(int[] NumArray) {
        int[] arr = new int[NumArray.length];
        int min = arr[0];
        for (int i = 0; i < NumArray.length; i++) {
            arr[i] = NumArray[i];
            if (arr[0] < min)
                ;
            {
                min = arr[0];
            }
        }
        return min;
    }

    /*
     * Returns the largest value in in the array of ints it gets as argument.
     */
    public static int max(int[] NumArray
) {
        int[] arr = new int[NumArray.length];
        int max = arr[0];
        for (int i = 0; i < NumArray.length; i++) {
            arr[i] = NumArray[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
     * Returns the addition of all the values in he array of doubles it gets
     * as argument.
     */
    public static double sum(double[] NumArray) {
        double sumD = 0;
        for (int i = 0; i < NumArray.length; i++) {
            sumD += NumArray[i];
        }
        return sumD;
    }

    /*
     * Returns the addition of all the values in the array of ints it gets
     * as argument.
     */
    public static int sum(int[] NumArray) {
        int sumInt = 0;
        for (int i = 0; i < NumArray.length; i++) {
            sumInt += NumArray[i];
        }
        return sumInt;
    }

    /*
     * Returns the average of the values in the array of doubles it gets as
     * argument.
     */
    public static double average(double[] NumArray) {
        double avrg = 0;
        for (int i = 0; i < NumArray.length; i++) {
            avrg += NumArray[i];
        }
        return avrg / NumArray.length;
    }

    /*
     * Returns the standard deviation of the values in the array of doubles
     * it gets as argument.
     */
    public static double standardDeviation(double[] NumArray) {
        double avrg = average(NumArray);
        double var = 0;
        for (int i = 0; i < NumArray.length; i++) {
            var = var + (NumArray[i] - avrg) * (NumArray[i] - avrg);
        }
        var = var / NumArray.length;
        return Math.sqrt(var);
    }

    /*
     * Returns the dot product between two arrays of doubles of the same length.
     * The arguments are two arrays of doubles, a and b, that have the same
     * number of elements.
     * The result is the dot product: a0*b0 + a1*b1 + ... + an*bn
     */
    public static double dotproduct(double[] a, double[] b) {
        double dotP = 0;
        for (int i = 0; i < a.length; i++) {
            dotP += a[i] * b[i];
        }
        return dotP;
    }

    /*
     * Takes to arrays of doubles, a and b, and returns the boolean value true
     * if and only if the arrays are equaly long and have the same values in
     * the same order. In all other cases returns false.
     */
    public static boolean equal(double[] a, double[] b) {
        if (a.length == b.length) {
            int T_or_F = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    T_or_F += 1;
                }
            }
            if (T_or_F == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /*
     * Takes to arrays of doubles, a and b, and returns the boolean value true
     * if and only if the arrays are equaly long and have the same values in
     * the same order. In all other cases returns false.
     */
    public static boolean equal(int[] a, int[] b) {
        if (a.length == b.length) {
            int T_or_F = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    T_or_F += 1;
                }
            }
            if (T_or_F == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /*
     * Plots the elements of the array as points using the course books StdDraw.
     * For each element in the array we draw a point with the position in the array
     * as x-value and the value in that position as y-value.
     * The scale is set to: on the x-dimension [-1, length] and on the
     * y-dimension [minimum in array - 0.1, maximum in array + 0.1].
     * The pen colour and the pen radius are set by the program that uses this
     * method,
     * they should not be set in the method.
     */
    public static void plot(double[] NumArray) {
        StdDraw.setXscale(-1, NumArray.length);
        StdDraw.setYscale(min(NumArray) - 0.1, max(NumArray) + 0.1);
        for (int i = 0; i < NumArray.length; i++) {
            StdDraw.point(i, NumArray[i]);
        }
    }

    /*
     * Plots the elements of the array as points using the course books StdDraw.
     * For each element in the array we draw a point with the position in the array
     * as x-value and the value in that position as y-value.
     * The scale is set to: on the x-dimension [-1, length] and on the
     * y-dimension [minimum in array - 1, maximum in array + 1].
     * The pen colour and the pen radius are set by the program that uses this
     * method,
     * they should not be set in the method.
     */
    public static void plot(int[] NumArray) {
        StdDraw.setXscale(-1, NumArray.length);
        StdDraw.setYscale(min(NumArray) - 1, max(NumArray) + 1);
        for (int i = 0; i < NumArray.length; i++) {
            StdDraw.point(i, NumArray[i]);
        }
    }

    /*
     * BONUS EXERCISE
     * Running (or moving) average.
     * From the wikipedia:
     * Given a series of numbers and a fixed subset size,
     * the first element of the moving average is obtained
     * by taking the average of the initial fixed subset of the number series.
     * Then the subset is modified by "shifting forward";
     * that is, excluding the first number of the series
     * and including the next value in the subset.
     *
     * We call the fixed subset size a window.
     *
     * Complete the definition of the method running average.
     */
    public static double[] runningAverage(double[] values, int window) {
        double[] averages = new double[values.length - window + 1];
        double init = 0;
        for (int j = 0; j < (values.length - window + 1); j++) {
            for (int i = 0; i < window; i++) {
                init += values[i + j];
            }
            averages[j] = init / window;
            init = 0;
        }
        return averages;
    }

    /*
     *
     * The program showcases all the methods implemented in the class.
     * To use these methods in other programs the class NumericalArrays
     * has to be in the same directory as the other program and
     * the methods are called prefixing NumericalArrays. as in
     * NumericalArrays.println(x)
     *
     * If you have solved the Bonus part (runningAverage) you have to add code
     * at the end of main to showcase your method with the array
     * {1,2,3,4,5,6,7,8,9,10} and window 3.
     *
     */
    public static void main(String[] args) {
        System.out.println();
        double[] x = linspace(0, Math.PI, 10);
        System.out.println("x is linspace(0, pi, 10):");
        println(x);
        System.out.println();

        int[] a = repeat(10, 5);
        System.out.println("a is repeat(10, 5):");
        println(a);
        System.out.println();

        a = range(-10, 10);
        System.out.println("a is now range(-10,10):");
        println(a);
        System.out.println();

        System.out.println("min(x): " + min(x) + "  max(x): " + max(x));
        System.out.println("min(a): " + min(a) + "  max(a): " + max(a));

        System.out.println("x equal linspace(0,pi,10)? " + equal(x, linspace(0, Math.PI, 10)));
        System.out.println("repeat(3,5) equal range(3,5)? " + equal(repeat(3, 5), range(3, 5)));

        System.out.println("sum(repeat(3,5)) = " + sum(repeat(3, 5)));

        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLACK);
        plot(x);

        // draw the coordinates in the canvas for x.
        StdDraw.setPenColor(StdDraw.RED);
        for (int i = 1; i < 4; i++) {
            StdDraw.point(0, i);
        }
        for (int i = 1; i < 10; i++) {
            StdDraw.point(i, 0);
        }
    }
}