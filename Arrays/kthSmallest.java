package Arrays;

import java.util.*;

public class kthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 3, 5, 7, 19 };
		int k=3;
		 Arrays.sort(arr);
		// Printing each element of the sorted array
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        
	        System.out.println("\n");
	        
		 if (k >= 1 && k <= arr.length) {
	            System.out.println("The " + k + "th smallest element is: " + arr[k - 1]);
	            System.out.println("The " + k + "th largest element is: " + arr[arr.length - k]);
	        } else {
	            System.out.println("Invalid value of k.");
	        }
	}

}
