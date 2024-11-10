package KI305.Symanyshyn.Lab5;
/**
 * ExpressionCalculator is a class for calculating the mathematical expression y = sin(x - 9) / (x - cos(2 * x)).
 */
public class ExpressionCalculator {

    /**
     * Calculates the expression y = sin(x - 9) / (x - cos(2 * x)).
     * 
     * @param x the input value for the expression
     * @return the calculated result
     * @throws IllegalArgumentException if the denominator is zero
     */
    public double calculate(double x) throws IllegalArgumentException {
        double denominator = x - Math.cos(2 * x);
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return Math.sin(x - 9) / denominator;
    }
}

