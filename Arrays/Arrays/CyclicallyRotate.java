package Arrays;

import java.util.Arrays;

//Program to cyclically rotate an array by one
public class CyclicallyRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
//		int n=arr.length;
//		int	temp=arr[n-1];
//		for(int i=n-1;i>0;i--) {
//		arr[i]=arr[i-1];
//		}
//		arr[0]=temp;
		
		 int i = 0, j = arr.length - 1;
	        while (i != j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	        }
		 System.out.println("Rotated Array is");
	        System.out.println(Arrays.toString(arr));
	}

}

