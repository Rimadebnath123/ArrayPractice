package Arrays;
//Minimize the maximum difference between the heights

import java.util.*;
public class MinMaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 7, 4, 8, 8, 8, 9 };
		int[] arr = { 1,15,10};
		int k = 6;
		int n=arr.length;
		int ans = getMinDiff(arr, n, k);
		System.out.println(ans);
	}

	// User function Template for Java
	public static int getMinDiff(int[] arr, int n, int k)
	{

		Arrays.sort(arr);
		// Maximum possible height difference
		int ans = arr[n - 1] - arr[0];

		int tempmin, tempmax;
		tempmin = arr[0];
		tempmax = arr[n - 1];

		for (int i = 1; i < n; i++) {

			// if on subtracting k we got negative then
			// continue
			if (arr[i] - k < 0)
				continue;

			// Minimum element when we add k to whole array
			tempmin = Math.min(arr[0] + k, arr[i] - k);

			// Maximum element when we subtract k from whole
			// array
			tempmax
				= Math.max(arr[i - 1] + k, arr[n - 1] - k);
			ans = Math.min(ans, tempmax - tempmin);
		}
		return ans;
	}
}
