package lab5;

public class ex3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int sum = 0;

        assert arr.length == arr2.length : "Arrays must have the same length";

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr2[i];
        }
        System.out.println("Sum of arrays: " + sum);
    }
}
