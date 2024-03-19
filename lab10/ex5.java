package lab10;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = new String[10];

        System.out.println("Enter 10 types of fruit:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Fruit " + (i + 1) + ": ");
            fruits[i] = scanner.nextLine();
        }

        Arrays.sort(fruits);

        System.out.println("\nFruits in ascending order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        scanner.close();
    }
}
