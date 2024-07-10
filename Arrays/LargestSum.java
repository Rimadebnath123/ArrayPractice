package Arrays;
//Largest Sum Contiguous Subarray (Kadane’s Algorithm)
public class LargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(arr));
	}
	public static int maxSubArraySum(int arr[]) {
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		int currsum=0;
		for(int i=0;i<n;i++) {
			currsum+=arr[i];
			if(max<currsum) {
				max=currsum;
			}
			if(currsum < 0) {
	            currsum = 0;
			}
				
		
		}
		return max;	
	}

}
