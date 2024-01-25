package lab4.exercise;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        int myNum;
        String grade;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input mark: ");
            myNum = scanner.nextInt();
        }

        if (myNum < 0 || myNum > 100) {
            grade = null;
        } else if (myNum >= 80) {
            grade = "A+";
        } else if (myNum >= 75) {
            grade = "A";
        } else if (myNum >= 70) {
            grade = "B+";
        } else if (myNum >= 65) {
            grade = "B";
        } else if (myNum >= 55) {
            grade = "C";
        } else if (myNum >= 50) {
            grade = "D";
        } else if (myNum >= 40) {
            grade = "F+";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is " + grade);
    }
}
