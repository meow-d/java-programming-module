package lab5;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int answer = 63;
        int upper = 100;
        int lower = 1;
        int response;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("The number is between " + lower + " and " + upper + ". Your answer is? ");
                response = scanner.nextInt();
                if (response == answer) {
                    System.out.println("Correct!");
                    break;
                } else {
                    if (response > answer) {
                        upper = response;
                    } else {
                        lower = response;
                    }
                }
            }
        }
    }
}
