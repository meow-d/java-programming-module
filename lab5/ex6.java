package lab5;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int printCount;
        String printString = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input print loop count: ");
            printCount = scanner.nextInt();
        }

        System.out.println("Ascending:");
        for (int i = 0; i < printCount; i++) {
            printString += "*";
            System.out.println(printString);
        }

        System.out.println("Decending:");
        for (int i = 0; i < printCount; i++) {
            System.out.println(printString);
            printString = printString.replaceFirst(".$", "");
        }
    }
}
