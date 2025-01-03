package Normal;
import java.util.*;
public class SumOfEvenOddInArray {

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[3][3];
	        long evenSum = 0, oddSum = 0;
	        System.out.println("Enter the elements of 3 x 3: ");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                arr[i][j] = in.nextInt();
	            }
	        }
	        
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (arr[i][j] % 2 == 0)
	                    evenSum += arr[i][j];
	                else
	                    oddSum += arr[i][j];
	            }
	        }
	        
	        System.out.println("Sum of even elements = " + evenSum);
	        System.out.println("Sum of odd elements = " + oddSum);
	        if (evenSum == oddSum)
	            System.out.println("Special Array");
	        else
	            System.out.println("Not a Special Array");
	    }

	}


