package lab5;

public class SortArray {
    public static void main(String[] args) {
        int numbers[] = { 84, 2, 2, 1, 5 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            int currentValue = numbers[i];
            int smallestValue = currentValue;
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < smallestValue) {
                    smallestValue = numbers[j];
                    minIndex = j;
                }
            }
            numbers[i] = smallestValue;
            numbers[minIndex] = currentValue;
        }

        System.out.println("Sorted:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
