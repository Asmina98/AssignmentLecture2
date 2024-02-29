package First;

public class Prog6 {
    public static void main(String[] args) {
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minimum = min(arrayOfInts);
        System.out.println("Minimum value: " + minimum);
    }
    // min method
    public static int min(int [] arr){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i <arr.length;i++){
            if(arr[i] < minimum) minimum = arr[i];
        }
        return minimum;
    }
}
