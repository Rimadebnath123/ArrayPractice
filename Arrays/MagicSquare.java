package Arrays;

import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("Enter the values for the 3x3 matrix:");

        // Input values into the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Check if the matrix is a Magic Square
        if (isMagicSquare(matrix)) {
            System.out.println("The given matrix is a Magic Square!");
        } else {
            System.out.println("The given matrix is NOT a Magic Square.");
        }
        sc.close();
    }

    // Method to check if a matrix is a Magic Square
    public static boolean isMagicSquare(int[][] matrix) {
        int magicSum = 0;

        // Calculate the sum of the first row
        for (int j = 0; j < 3; j++) {
            magicSum += matrix[0][j];
        }

        // Check the sum of all rows
        for (int i = 1; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        // Check the sum of all columns
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        // Check the sum of the main diagonal
        int mainDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != magicSum) {
            return false;
        }

        // Check the sum of the secondary diagonal
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            secondaryDiagonalSum += matrix[i][2 - i];
        }
        if (secondaryDiagonalSum != magicSum) {
            return false;
        }

        // If all checks pass, the matrix is a Magic Square
        return true;
    }
}

