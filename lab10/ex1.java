package lab10;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] numbers = new double[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }

        System.out.println("The sum of the numbers is " + sum);
    }
}
