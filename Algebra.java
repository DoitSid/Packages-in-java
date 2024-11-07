package Mathematics;


//This package will help you build Programs related to algebric terms -siddhi

public class Algebra {
    // Calculates the square root of a number
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Power of a number
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Solves a quadratic equation ax^2 + bx + c = 0 and returns the roots
    public static double[] solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            throw new ArithmeticException("No real roots");
        }
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new double[] { root1, root2 };
    }
}
