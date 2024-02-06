package lab5;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int printCount;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Input print loop count, which must be between 2 and 10: ");
                printCount = scanner.nextInt();
            } while (printCount < 2 || printCount > 10);
        }

        for (int i = 0; i < printCount; i++) {
            System.out.print(" ".repeat(printCount - i));
            System.out.println("*".repeat(i * 2 + 1));
        }
    }
}
