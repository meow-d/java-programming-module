package lab3.exercise;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        int first, second, third;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input first number: ");
            first = scanner.nextInt();
            System.out.print("Input second number: ");
            second = scanner.nextInt();
            System.out.print("Input third number: ");
            third = scanner.nextInt();
        }

        int largest = first;
        int smallest = first;
        if (second > largest) {
            largest = second;
        } else {
            smallest = second;
        }
        if (third > largest) {
            largest = third;
        } else {
            smallest = third;
        }

        System.out.printf("Largest number: %d%n", largest);
        System.out.printf("Smallest number: %d%n", smallest);
    }
}
