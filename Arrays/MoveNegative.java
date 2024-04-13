package Arrays;

import java.util.*;

public class MoveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { -12, 11, -13, -5, 6, -7, 5, -3, -6};
		
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		 
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= 0 && arr[j + 1] < 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    
	}

}
