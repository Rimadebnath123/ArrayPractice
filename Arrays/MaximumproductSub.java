package Arrays;
//Maximum Product Subarray
//Given an array that contains both positive and negative integers, the task is to find the product of the maximum product subarray. 
//Time-o(n),o(1)-space

public class MaximumproductSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1, -3, -10, 0, 60};
		//int arr[]= {1, -2, -3, 0, 7, -8, -2};
		int n=arr.length;
		System.out.println(maxProsub(n,arr));
}
	public static int maxProsub(int n,int arr[]) {
//		int maxpro = arr[0];
//        int minpro = arr[0];
//        int max = arr[0];
//
//        for (int i = 1; i < n; i++) {
//            if (arr[i] < 0) {
//                int temp = maxpro;
//                maxpro = minpro;
//                minpro = temp;
//            }
//
//            maxpro = Math.max(arr[i], maxpro * arr[i]);
//            System.out.println("max"+maxpro);
//            minpro = Math.min(arr[i], minpro * arr[i]);
//            System.out.println("min"+minpro);
//
//            if (max < maxpro) {
//                max = maxpro;
//                System.out.println(max + " of " + arr[i]);
//            }
//	}
		int max=arr[0];
		for (int i = 0; i < n; i++) {
            int mul = arr[i];
            // traversing in current subarray o(n^2),o(1)
            for (int j = i + 1; j < n; j++) {
                // updating result every time to keep an eye
                // over the maximum product
                max = Math.max(max, mul);
                mul *= arr[j];
            }
            // updating the result for (n-1)th index.
            max = Math.max(max, mul);
        }
        
		return max;
		}
		
	}


