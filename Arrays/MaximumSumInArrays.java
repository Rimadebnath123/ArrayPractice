package Arrays;
//Maximum sum of i*arr[i] among all rotations of a given array
//o(n2) o(1)
public class MaximumSumInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8, 3, 1, 2};
		int n=arr.length;
		System.out.println("The maximum sum is "+MaxSum(arr,n));
	}
//	public static int MaxSum(int arr[],int n) {
//		
//		int msum=Integer.MIN_VALUE;
//		
//		for(int i=0;i<n;i++) {
//			int sum=0;
//			for(int j=0;j<n;j++) 
//			{
//				int index = (i + j) % n;
//				sum+=j*arr[index];
//				//System.out.println(sum);
//				}
//			msum = Math.max(msum, sum);
//			
//		}
//		return msum;
//	}
	
	//o(n) o(1)
	static int MaxSum(int arr[], int n)
    {
        // Compute sum of all array elements
        int cum_sum = 0;
        for (int i = 0; i < n; i++) {
            cum_sum += arr[i];
//            System.out.println(cum_sum);
            
        }
 
        // Compute sum of i*arr[i] for 
        // initial configuration.
        int curr_val = 0;
        for (int i = 0; i < n; i++) {
            curr_val += i * arr[i];
//            System.out.println("cv"+curr_val);
        }
 
        // Initialize result
        int res = curr_val;
 
        // Compute values for other iterations
        for (int i = 1; i < n; i++)
        {
            // Compute next value using previous
            // value in O(1) time
//        	 System.out.println("cv"+curr_val);
//        	 System.out.println(cum_sum);
            int next_val = curr_val - (cum_sum -
                          arr[i-1]) + arr[i-1] *
                          (n-1);
// System.out.println("nv"+next_val);
            // Update current value
            curr_val = next_val;
 
            // Update result if required
            res = Math.max(res, next_val);
        }
 
        return res;
    }

}
