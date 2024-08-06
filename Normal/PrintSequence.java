package Normal;

import java.util.Scanner;

public class PrintSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int N = sc.nextInt();
        sc.close();

        int numerator = 1;
        int denominator = 2;

        System.out.println("The sequence is:");
        for (int i = 0; i < N; i++) {
            System.out.print(numerator + "/" + denominator);
            if (i < N - 1) {
                System.out.print(", ");
            }
            numerator++;
            denominator = nextPrime(denominator + 1);
        }
    }

    // Method to find the next prime number greater than or equal to start
    public static int nextPrime(int start) {
        while (true) {
            if (isPrime(start)) {
                return start;
            }
            start++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



