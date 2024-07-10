package Arrays;
//Find the first repeating element in an array of integers
public class FirstRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6, 10, 5, 4, 9, 120, 4, 6, 10};
		int n=arr.length;
		int in=repeatFirst(arr,n);
		System.out.println("the repeted no is:"+arr[in]);
		}
	public static int repeatFirst(int arr[],int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				return i;
			}
			}
		}
		return -1;
		
	}

}
