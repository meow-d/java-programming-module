package lab4;

public class temperature {
    public static void main(String[] args) {
        double low_temperture = -10.0;
        double high_temperture = 10.0;
        double cent, fahr;

        System.out.println("Celsius\tFahrenheit");
        for (cent = low_temperture; cent <= high_temperture; cent += 1.0) {
            fahr = (9.0 / 5.0) * cent + 32.0;
            System.out.printf("%.2f\t%.2f%n", cent, fahr);
        }
    }
}
