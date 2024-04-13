package Arrays;

public class SubArraySum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 10, 2, -2, -20, 10 };
	        int n = arr.length;
	        int sum = -10;
	        int curr_sum, i, j;
	        
	        // Pick a starting point
	        for (i = 0; i < n; i++) {
	            curr_sum = 0;
	 
	            // try all subarrays starting with 'i'
	            for (j = i; j < n; j++) {
	                curr_sum += arr[j];
	 
	                if (curr_sum == sum) {
	                    System.out.print(
	                        "Sum found between indexes " + i + " and " + j);
	                    return ;
	                }
	            }
	        }
	 
	        System.out.print("No subarray found");
	        return ;
	}

}
