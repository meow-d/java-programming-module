package lab4;

public class mathRandomTest {
    public static void main(String[] args) {
        int repeatCount = 5;
        double sum = 0;
        for (int i = 0; i < repeatCount; i++) {
            double random = Math.random();
            System.out.println(random);
            sum += random;
        }
        double average = sum / repeatCount;

        System.out.println("average: " + average);
    }
}
