package lab2.exercise;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        int myNum;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");
            myNum = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < 5; i++) {
            myNum += 1;
            System.out.println(myNum);
            // or System.out.println(++myNum);
        }
    }
}
