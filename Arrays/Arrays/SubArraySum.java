package Arrays;
//Find Subarray with given sum | Set 1 (Non-negative Numbers)
public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
 
            if (currentSum == sum) {
                System.out.println("Sum found at indexe " + i);
                return;
            }
            else {
                // Try all subarrays starting with 'i'
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];
 
                    if (currentSum == sum) {
                        System.out.println(
                            "Sum found between indexes " + i
                            + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;

}
}
