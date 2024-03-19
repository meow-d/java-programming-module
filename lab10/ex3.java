package lab10;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence1 = scanner.nextLine();
        System.out.print("Enter another sentence: ");
        String sentence2 = scanner.nextLine();

        String fullSentence = sentence1.concat(" and ").concat(sentence2);
        System.out.println("Full sentence: " + fullSentence);
        System.out.println("Lowercase:" + fullSentence.toLowerCase());
        System.out.println("Uppercase:" + fullSentence.toUpperCase());
        System.out.println("No spaces:" + fullSentence.replace(" ", ""));
        System.out.println("Snake case:" + fullSentence.replace(" ", "_"));
        System.out.println("Characters index from 7 to 18: " + fullSentence.substring(7, 18));
        System.out.println("Reverse: " + new StringBuilder(fullSentence).reverse().toString());

        scanner.close();
    }
}
