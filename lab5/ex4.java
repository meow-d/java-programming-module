package lab5;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int first, second;
        char cont;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Input first num: ");
                first = scanner.nextInt();
                System.out.print("Input second num: ");
                second = scanner.nextInt();
                System.out.println("Sum: " + (first + second));

                System.out.print("Continue? (y/n): ");
                cont = scanner.next().charAt(0);
                if (cont == 'n') {
                    break;
                }
            }
        }
    }
}
