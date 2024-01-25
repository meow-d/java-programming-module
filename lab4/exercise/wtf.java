package lab4.exercise;

import java.util.Scanner;

public class wtf {
    public static void main(String[] args) {
        int first;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number: ");
            first = scanner.nextInt();
        }

        if (first < 1 || first > 9999) {
            System.out.println("Invalid input");
        } else if (first < 10) {
            System.out.println("1 digit");
        } else if (first < 100) {
            System.out.println("2 digits");
        } else if (first < 1000) {
            System.out.println("3 digits");
        } else {
            System.out.println("4 digits");
        }
    }
}
