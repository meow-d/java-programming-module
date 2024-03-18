package lab10;

import java.io.*;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numString = scanner.nextLine();
        try {
            int num = Integer.parseInt(numString);
            System.out.println("The number is " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a number.");
        }
    }
}
