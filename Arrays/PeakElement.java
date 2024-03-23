//Find a peak element which is not smaller than its neighbours
package Arrays;
import java.util.*;
public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10, 20, 15, 2, 23, 90, 67};
		//int arr[]= {1, 3, 20, 4, 1, 0 };
		int n = arr.length;
		//int peak=0;
		ArrayList<Integer>peak=new ArrayList<>();
	        for (int i = 1; i < n-1; i++) {
	            // Check if the neighbors are smaller
	            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
	            	//System.out.println(i);
	            	//peak=arr[i];
	            	 peak.add(arr[i]);
	            }
	               
	        }
	        
		System.out.println("the peak element is" +peak );
		
	}
	

}
