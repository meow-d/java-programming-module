package lab2.exercise;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        double seconds;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter a number of seconds: ");
            seconds = Double.parseDouble(scanner.nextLine());
        }

        double hours = seconds / 3600;
        System.out.println(seconds + " seconds is eqvalent to " + hours + " hours");
    }
}
