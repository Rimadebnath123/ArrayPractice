package Arrays;
//Find the Minimum element in a Sorted and Rotated Array
//o(n),o(1)
public class MinELementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 6, 1, 2, 3, 4};
		int n=arr.length;
		System.out.println("The min no is "+findMin(arr,n));
		
	}
	public static int findMin(int arr[],int n) {
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
