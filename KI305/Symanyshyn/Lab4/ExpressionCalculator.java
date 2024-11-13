package KI305.Symanyshyn.Lab4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ExpressionCalculator is a class for calculating the mathematical expression y = sin(x - 9) / (x - cos(2 * x)).
 * It includes exception handling to manage division by zero.
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

    /**
     * Writes the result to a specified file.
     * 
     * @param result the result to write to the file
     * @param filename the name of the file
     * @throws IOException if an I/O error occurs
     */
    public void writeResultToFile(double result, String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Calculation result: " + result);
        }
    }
    
    /*public static void main(String[] args) {
        ExpressionCalculator calculator = new ExpressionCalculator();
        double x = 4.0;  // Example input
        
        try {
            double result = calculator.calculate(x);
            System.out.println("Result:" + result);
            calculator.writeResultToFile(result, "result.txt");
            System.out.println("Calculation completed and saved to file.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
    }*/
}
