package KI305.Symanyshyn.Lab5;

import java.io.IOException;

/**
 * ExpressionCalculatorTest is a driver program for testing the ExpressionCalculator and FileHandler classes.
 */
public class ExpressionCalculatorTest {

    public static void main(String[] args) {
        ExpressionCalculator calculator = new ExpressionCalculator();
        FileHandler fileHandler = new FileHandler();
        double x = 5.0;  // Example input

        try {
            // Write the argument to files
            fileHandler.writeArgumentToTextFile(x, "argument.txt");
            fileHandler.writeArgumentToBinaryFile(x, "argument.bin");

            // Read the argument back from files
            double textArgument = fileHandler.readArgumentFromTextFile("argument.txt");
            double binaryArgument = fileHandler.readArgumentFromBinaryFile("argument.bin");

            // Calculate the result
            double result = calculator.calculate(textArgument);

            // Write results to text and binary files
            fileHandler.writeResultToTextFile(result, "result.txt");
            fileHandler.writeResultToBinaryFile(result, "result.bin");

            // Read results back from files
            double textResult = fileHandler.readResultFromTextFile("result.txt");
            double binaryResult = fileHandler.readResultFromBinaryFile("result.bin");

            // Print results for testing
            System.out.println("Argument from text file: " + textArgument);
            System.out.println("Argument from binary file: " + binaryArgument);
            System.out.println("Result from text file: " + textResult);
            System.out.println("Result from binary file: " + binaryResult);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
    }
}


