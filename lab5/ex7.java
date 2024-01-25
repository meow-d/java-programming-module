package lab5;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int printCount;
        String printString = "";
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Input print loop count, which must be between 2 and 10: ");
                printCount = scanner.nextInt();
                if (printCount >= 2 && printCount <= 10) {
                    break;
                }
            }
        }

        System.out.println("Ascending:");
        for (int i = 0; i < printCount; i++) {
            printString = "";
            for (int j = 0; j < (printCount - i) / 2; j++) {
                printString += " ";
            }
            for (int j = 0; j < i; j++) {
                printString += "*";
            }
            System.out.println(printString);
        }
    }
}
