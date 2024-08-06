package Arrays;
//Program to find the Sum of each Row and each Column of a Matrix
import java.util.Scanner;

public class SumColWise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        // Get each row sum
        row_sum(arr, m, n);
        
        // Get each column sum
        column_sum(arr, m, n);
    }

    public static void row_sum(int[][] arr, int m, int n) {
        System.out.println("Sum of each row:");
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }

    public static void column_sum(int[][] arr, int m, int n) {
        System.out.println("Sum of each column:");
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + sum);
        }
    }
}
