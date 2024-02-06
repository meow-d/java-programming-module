package lab3.exercise;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        int myNum;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number: ");
            myNum = scanner.nextInt();
        }

        if (myNum == 0) {
            System.out.printf("%d is zero", myNum);
            return;
        }

        System.out.printf("%d is %s", myNum, myNum > 0 ? "positive" : "negative");
    }
}
