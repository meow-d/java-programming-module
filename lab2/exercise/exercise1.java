package lab2.exercise;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        double first, second;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("The first number is: ");
            first = Double.parseDouble(scanner.nextLine());
            System.out.print("The second number is: ");
            second = Double.parseDouble(scanner.nextLine());
        }
        double average = first + second / 2;
        System.out.println("The average is: " + average);
    }
}
