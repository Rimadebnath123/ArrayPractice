package Normal;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is automorphic
        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        // Close the scanner
        sc.close();
    
	}
	public static boolean isAutomorphic(int number) {
		int square = number * number;
        
        // Use while loop to check if the number is automorphic
        while (number > 0) {
            // If the last digits are not the same, return false
            if (number % 10 != square % 10) {
                return false;
            }

            // Remove the last digit from both numbers
            number /= 10;
            square /= 10;
        }

        // If we finish the loop, it means all digits matched
        return true;
    	
	}

}
