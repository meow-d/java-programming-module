package lab3.exercise;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        int myNum;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input week number: ");
            myNum = scanner.nextInt();
        }

        switch (myNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("TuesDay");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day range.");
                break;
        }
    }
}
