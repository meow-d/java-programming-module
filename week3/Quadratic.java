package week3;

final class QuadraticResult {
    private final double first;
    private final double second;

    public QuadraticResult(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }
}

public class Quadratic {
    public static QuadraticResult main(double a, double b, double c) {
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            return null;
        }

        double sqrtDiscriminant = Math.sqrt(discriminant);
        double denominator = 2 * a;

        double firstResult = (-b + sqrtDiscriminant) / denominator;
        double secondResult = (-b - sqrtDiscriminant) / denominator;

        return new QuadraticResult(firstResult, secondResult);
    }
}
