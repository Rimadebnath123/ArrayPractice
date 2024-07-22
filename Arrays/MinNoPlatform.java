package Arrays;

import java.util.*;

//Minimum Number of Platforms Required for a Railway/Bus Station
//Time Complexity: O(n2), Auxiliary space: O(1),   
public class MinNoPlatform {

	public static void main(String[] args) {
	        int arr[] = { 100, 300, 500 };
	        int dep[] = { 900, 400, 600 };
	        int n = arr.length;
	        System.out.println(findPlatform(arr, dep, n));
	    }
//		public static int findPlatform(int arr[], int dep[],int n){
//			int plat_nd=1,res=1;
//
//			// run a nested  loop to find overlap
//			for (int i = 0; i < n; i++) {
//				// minimum platform
//				plat_nd = 1;
//				
//				for (int j = 0; j < n; j++) {
//					if (i != j)
//						// check for overlap
//						if (arr[i] >= arr[j] && dep[j] >= arr[i])
//							plat_nd++;
//						}
//
//				// update result
//				res = Math.max(res, plat_nd);
//			}
//
//			return res;
//		}
		
		//[Most Efficient Approach] Using Sweep Line Algorithm – O(n) time and O(maxDepartureTime) auxiliary space
	
//		public static int findPlatform(int[] arr, int[] dep, int n)
//	    {
//	        int count = 0, maxPlatforms = 0;
//	        // Find the maximum departure time
//	        int maxDepartureTime = dep[0];
//	        for (int i = 1; i < n; i++) {
//	            maxDepartureTime = Math.max(maxDepartureTime, dep[i]);
//	            System.out.println(maxDepartureTime);
//	        }
//
//	        // Create a vector to store the count of trains at each time
//	        List<Integer> v = new ArrayList<>(maxDepartureTime + 2);
//	        for (int i = 0; i < maxDepartureTime + 2; i++) {
//	            v.add(0);
//	            
//	        }
//
//	        // Increment the count at the arrival time and decrement at the departure time
//	        for (int i = 0; i < n; i++) {
//	            v.set(arr[i], v.get(arr[i]) + 1);
//	            v.set(dep[i] + 1, v.get(dep[i] + 1) - 1);
//	        }
//
//	        // Iterate over the vector and keep track of the maximum sum seen so far
//	        for (int i = 0; i <= maxDepartureTime + 1; i++) {
//	            count += v.get(i);
//	            maxPlatforms = Math.max(maxPlatforms, count);
//	        }
//
//	        return maxPlatforms;
//	    }
	
	//Greedy algo  Time Complexity: O(N * log N),space: O(1),
		
		static int findPlatform(int arr[], int dep[], int n)
	    {
	        // Sort arrival and departure arrays
	        Arrays.sort(arr);
	        Arrays.sort(dep);

	        // plat_needed indicates number of platforms
	        // needed at a time
	        int plat_needed = 1, result = 1;
	        int i = 1, j = 0;

	        // Similar to merge in merge sort to process
	        // all events in sorted order
	        while (i < n && j < n) {
	            // If next event in sorted order is arrival,
	            // increment count of platforms needed
	            if (arr[i] <= dep[j]) {
	                plat_needed++;
	                i++;
	            }

	            // Else decrement count of platforms needed
	            else if (arr[i] > dep[j]) {
	                plat_needed--;
	                j++;
	            }

	            // Update result if needed
	            if (plat_needed > result)
	                result = plat_needed;
	        }

	        return result;
	    }

		}


