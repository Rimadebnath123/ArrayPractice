package Arrays;
//Count pairs with given sum
public class countPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 5, 7, -1, 5};
		int n=arr.length;
		int k=6;
		int count=0;
		int currentSum=0;
		for (int i = 0; i < n; i++) {
			 for (int j = i + 1; j < n; j++) {
                 currentSum =arr[i]+arr[j];
                 if (currentSum == k) {
                	 count++;
                	 }
                 }	 
		}
		System.out.println(count);	
	}

}
