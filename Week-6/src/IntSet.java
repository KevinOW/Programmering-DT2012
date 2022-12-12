public class IntSet {

    boolean[] array;
    int bound;

    public IntSet(int n) {
        array = new boolean[n + 1];
        bound = n;
    }

    public IntSet(int n, int[] values) {

        array = new boolean[n + 1];
        for (int i = 0; i < values.length; i++) {
            array[values[i]] = true;
        }
        bound = array.length - 1;
    }

    public boolean has(int x) {
        return array[x];
    }

    public void addValue(int x) {
        array[x] = true;
    }

    public String toString() {
        String string = "{";
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                string += i + ", ";
            }
        }
        if (string.length() > 0) {
            string = string.substring(0, string.length() - 2);
        }
        string += "}";
        return string;
    }

    public static void main(String[] args) {
        IntSet intSet = new IntSet(5);
        intSet.addValue(2);
        intSet.addValue(4);
        intSet.addValue(6);
        System.out.println("intSet contains 2: " + intSet.has(2));
        System.out.println("intSet contains 1: " + intSet.has(1));
        System.out.println("intSet contains 6: " + intSet.has(6));
        System.out.println("intSet contains 6: " + intSet.has(6));
        System.out.println(intSet);

    }
}