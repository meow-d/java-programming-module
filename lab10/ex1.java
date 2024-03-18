package lab10;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        try {
            for (int i = 0; i < 11; i++) {
                numbers[i] = random.nextInt(100);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }

        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
    }
}
