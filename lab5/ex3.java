package lab5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int printCount;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input print loop count: ");
            printCount = scanner.nextInt();
        }

        boolean iIsEven = false;
        for (int i = 0; i < printCount; i++) {
            if (iIsEven) {
                System.out.println("+++++");
            } else {
                System.out.println("*****");
            }
            iIsEven = !iIsEven;
        }
    }
}
