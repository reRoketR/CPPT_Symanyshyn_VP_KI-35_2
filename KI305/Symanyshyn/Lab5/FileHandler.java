package KI305.Symanyshyn.Lab5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileHandler provides methods for writing and reading results and arguments
 * to and from files in both text and binary formats.
 */
public class FileHandler {

    /**
     * Writes a calculation result to a text file.
     * 
     * @param result the result to write to the file
     * @param filename the name of the text file
     * @throws IOException if an I/O error occurs
     */
    public void writeResultToTextFile(double result, String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Calculation result: " + result);
        }
    }

    /**
     * Writes a calculation result to a binary file.
     * 
     * @param result the result to write to the binary file
     * @param filename the name of the binary file
     * @throws IOException if an I/O error occurs
     */
    public void writeResultToBinaryFile(double result, String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeDouble(result);
        }
    }

    /**
     * Reads a calculation result from a text file.
     * 
     * @param filename the name of the text file to read from
     * @return the result read from the text file
     * @throws IOException if an I/O error occurs or file format is incorrect
     */
    public double readResultFromTextFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            return Double.parseDouble(line.split(": ")[1]);
        }
    }

    /**
     * Reads a calculation result from a binary file.
     * 
     * @param filename the name of the binary file to read from
     * @return the result read from the binary file
     * @throws IOException if an I/O error occurs
     */
    public double readResultFromBinaryFile(String filename) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            return dis.readDouble();
        }
    }

    /**
     * Writes an argument (value of x) to a text file.
     * 
     * @param x the argument to write to the file
     * @param filename the name of the text file
     * @throws IOException if an I/O error occurs
     */
    public void writeArgumentToTextFile(double x, String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Argument: " + x);
        }
    }

    /**
     * Writes an argument (value of x) to a binary file.
     * 
     * @param x the argument to write to the binary file
     * @param filename the name of the binary file
     * @throws IOException if an I/O error occurs
     */
    public void writeArgumentToBinaryFile(double x, String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeDouble(x);
        }
    }

    /**
     * Reads an argument (value of x) from a text file.
     * 
     * @param filename the name of the text file to read from
     * @return the argument read from the text file
     * @throws IOException if an I/O error occurs or file format is incorrect
     */
    public double readArgumentFromTextFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            return Double.parseDouble(line.split(": ")[1]);
        }
    }

    /**
     * Reads an argument (value of x) from a binary file.
     * 
     * @param filename the name of the binary file to read from
     * @return the argument read from the binary file
     * @throws IOException if an I/O error occurs
     */
    public double readArgumentFromBinaryFile(String filename) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            return dis.readDouble();
        }
    }
}
