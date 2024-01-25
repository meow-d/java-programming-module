package lab3.exercise;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        double radius;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");
            radius = scanner.nextDouble();
        }

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.printf("A circle with a radius of %.2f:\n", radius);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Circumference: %.2f\n", circumference);
    }
}
