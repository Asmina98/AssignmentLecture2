package First;

import java.util.Arrays;


public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};

        Prog5 prog = new Prog5();
        int[] combinedArray = prog.combine(a, b);

        System.out.println("Output array: " + Arrays.toString(combinedArray));
    }

    public int[] combine(int[] a, int[] b) {
        int[] combinedArray = new int[a.length + b.length];
        System.arraycopy(a, 0, combinedArray, 0, a.length);
        System.arraycopy(b, 0, combinedArray, a.length, b.length);
        return combinedArray;
    }
}

