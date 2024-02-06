package lab2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Please enter your age: ");
            String ageString = scanner.nextLine();
            int age = Integer.parseInt(ageString);

            System.out.print("Please enter your hobby: ");
            String hobby = scanner.nextLine();

            System.out.print("Please enter your email address: ");
            String emailAddress = scanner.nextLine();

            AnotherClass anotherClassObject = new AnotherClass(
                    name,
                    age,
                    hobby,
                    emailAddress);

            String output = String.format(
                    "%s Your name is %s and your age is %d. Your hobby is %s and your email address is %s.",
                    anotherClassObject.greeting,
                    anotherClassObject.name,
                    anotherClassObject.age,
                    anotherClassObject.hobby,
                    anotherClassObject.emailAddress);
            System.out.println(output);
        }
    }
}
