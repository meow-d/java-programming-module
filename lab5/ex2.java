package lab5;

public class ex2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int smallest = arr[0], largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("smallest: " + smallest);
        System.out.println("largest: " + largest);
    }
}
