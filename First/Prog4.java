package First;

public class Prog4 {
    public static void main(String[] args) {
        float num1 = 1.27f;
        float num2 = 3.881f;
        float num3 = 9.6f;

        float sum = num1 + num2 + num3;

        int sumAsInt = (int) sum; // Casting sum to int
        int roundedSum = Math.round(sum); // Rounding sum to nearest integer using Math.round function

        System.out.println("Sum of the floats as an integer (casted): " + sumAsInt);
        System.out.println("Sum of the floats as an integer (rounded): " + roundedSum);
    }
}

