package lab3;

import java.util.Scanner;

public class averageScore {
    public static void main(String[] args) {
        String input;
        double average = 0;
        double score;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Input score: ");
                input = scanner.nextLine();

                try {
                    score = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please input a number.");
                    continue;
                }
                average = (average + score) / 2;

                System.out.println("Average score: " + average);
            } while (input != "-1");
        }
    }
}
