package Arrays;

import java.util.*;
public class DuplicateMaxOddValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {2, 3, 4, 3,7, 5, 9, 8, 4, 5,7};
		 int result = findDuplicateHighestOdd(arr);
		 System.out.println("Duplicate highest odd element: " + result);
	}
	public static int findDuplicateHighestOdd(int[] arr) {
		ArrayList<Integer>odd=new ArrayList<>();
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i]%2!=0) {
    		  odd.add(arr[i]); 
    	   }
       }
       System.out.println(odd);
       int max = Integer.MIN_VALUE; // Initialize max variable outside the loop
       for (int i = 0; i < odd.size() - 1; i++) {
           for (int j = i + 1; j < odd.size(); j++) {
               if (odd.get(i).equals(odd.get(j))) {
                   max = Math.max(max, odd.get(i)); // Update max
                   //System.out.println(max);
               }
           }
       }
       if (max != Integer.MIN_VALUE) {
           return max; // Return max if it's updated
       }

       return Integer.MIN_VALUE;
	}

}
