package lab10;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a to be converted to ascii: ");
            String numString = scanner.nextLine();

            try {
                int num = Integer.parseInt(numString);
                char c = (char) num;
                System.out.println("The number is " + num + " and the character is " + c);

                if (num > 0 && num < 127) {
                    break;
                }
                System.out.println("Though, please enter a number between 0 and 127.");

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a number between 0 and 127.");
            }
        }

        scanner.close();
    }
}
