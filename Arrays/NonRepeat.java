package Arrays;
//Find first non-repeating element in a given Array of integers
public class NonRepeat {

	public static void main(String[] args) {
		int arr[]= {9, 4, 9, 6, 7, 4};
		int n=arr.length;
		int in=firstNonrepeat(arr,n);
		System.out.println("the non repeted no is:"+arr[in]);
		}
	public static int firstNonrepeat(int arr[],int n) {
		
		for(int i=0;i<n;i++) {
				 boolean isRepeated = false;
		            for (int j = 0; j < n; j++) {
		                if (i != j && arr[i] == arr[j]) {
		                    isRepeated = true;
		                    break;
		                }
		            }
		            if (!isRepeated) {
		                return i;
		            }
		        }
		        return -1;
		
	}

}
