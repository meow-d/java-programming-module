package lab2;

public class QuadraticTest {
    public static void main(String[] args) {
        QuadraticResult result = Quadratic.main(2, 10, 2);
        System.out.println(result.getFirstRoot());
        System.out.println(result.getSecondRoot());
    }
}
