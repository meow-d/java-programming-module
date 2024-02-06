package lab2.exercise;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        int myNum;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");
            myNum = scanner.nextInt();
        }

        System.out.printf("%03d is %s", myNum, myNum % 2 == 0 ? "even" : "odd");
    }
}
