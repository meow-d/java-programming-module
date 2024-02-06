package lab2;

final class QuadraticResult {
    private final double firstRoot;
    private final double secondRoot;

    public QuadraticResult(double firstRoot, double secondRoot) {
        this.firstRoot = firstRoot;
        this.secondRoot = secondRoot;
    }

    public double getFirstRoot() {
        return firstRoot;
    }

    public double getSecondRoot() {
        return secondRoot;
    }
}

public class Quadratic {
    public static QuadraticResult main(double a, double b, double c) {
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            return null;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new QuadraticResult(root, root);
        }

        double sqrtDiscriminant = Math.sqrt(discriminant);
        double denominator = 2 * a;

        double firstRoot = (-b + sqrtDiscriminant) / denominator;
        double secondRoot = (-b - sqrtDiscriminant) / denominator;

        return new QuadraticResult(firstRoot, secondRoot);
    }
}
