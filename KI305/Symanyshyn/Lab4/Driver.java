package KI305.Symanyshyn.Lab4;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) {
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
    }
}
