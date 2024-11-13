import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
  * 
  * @author Volodymyr Symanyshyn
  * @version 1.0
  */
 public class Lab1SymanyshynKI305 {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Ввід розміру матриці
         System.out.println("Input matrix size: ");
         int row = sc.nextInt();
         if (row <= 0) {
             System.out.println("Incorrect matrix size!");
             sc.close();
             return;
         }
 
         // Ввід символа заповнювача
         System.out.println("Input filler symbol: ");
         String symbol = sc.next();
 
         // Перевірка на валідність символа заповнювача
         if (symbol.length() != 1) {
             System.out.println("Incorrect filler size!");
             sc.close();
             return;
         }
 
         String[][] arr = createLengthForSubArr(row);
         String fileName = "Lab1.txt";
         try(sc) {
             printMatrix(arr, symbol, row, fileName);
         } catch (IOException e) {
             throw new RuntimeException("Exception happen while writing to a file: " + e.getMessage());
         }
 
     }
 
     /**
      * Method that allocates the required length for each line
      *
      * @param row matrix size
      * @return String[][] - new matrix
      * */
     public static String[][] createLengthForSubArr(int row){
         String[][] arr = new String[row][];
 
         for (int i = 0; i < row; i++) {
             int length = 0;
 
             for (int j = 0; j < row; j++) {
                 if (i >= row / 2 && (j >= row - i - 1 && j <= i)) {
                     length++;
                 }
             }
 
             arr[i] = new String[length];
         }
 
         return arr;
     }
 
 
     /**
      * Method that generates a jagged array and prints it to a text file
      *
      * @param arr matrix to fill
      * @param symbol filler symbol
      * @param row matrix size
      * @param file file name
      * @throws IOException if some error ocurres while writing to a file 
      * */
     public static void printMatrix(String[][] arr, String symbol, int row, String file) throws IOException {
         System.out.println("Result matrix: ");
 
         try (FileWriter writer = new FileWriter(file)) {
             for (int i = 0; i < row; i++) {
                 int indexJ = 0;
 
                 for (int j = 0; j < row; j++) {
                     if (i >= row / 2 && (j >= row - i - 1 && j <= i)) {
                         arr[i][indexJ] = symbol;
 
                         writer.write(arr[i][indexJ] + " ");
                         System.out.print(arr[i][indexJ] + " ");
 
                         indexJ++;
                     } else {
                         writer.write("  ");
                         System.out.print("  ");
                     }
                 }
                 System.out.println();
                 writer.write("\n");
             }
 
             writer.flush();
         }
     }
 }
 
 
 