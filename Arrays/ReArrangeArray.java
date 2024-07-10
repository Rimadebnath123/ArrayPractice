package Arrays;
//Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
public class ReArrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        int n = arr.length;
        System.out.println("Rearranged array is ");
        rearrange(arr, n);

        printArray(arr, n);
	}
	public static void rearrange(int arr[], int n) {
        int outofplace = -1;

        for (int i = 0; i < n; i++) {
            if (outofplace >= 0)//1st con
            	{
                if (((arr[i] >= 0) && (arr[outofplace] < 0)) || ((arr[i] < 0 )&& (arr[outofplace] >= 0))) {
                	
                    rightRotate(arr, n, outofplace, i);

                    	if (i - outofplace >= 2)
                        outofplace += 2;
                    	else
                        outofplace = -1;
                }
            }
//2nd con
            if (outofplace == -1) {
                if ((arr[i] >= 0 && i % 2 == 0) || (arr[i] < 0 && i % 2 == 1)) {
                    outofplace = i;
                }
            }
        }
	}
    

	    // Utility function to right rotate all elements between
	    // [outofplace, cur]
	public static void rightRotate(int arr[], int n, int outofplace, int cur) {
        int temp = arr[cur];
        for (int i = cur; i > outofplace; i--)
            arr[i] = arr[i - 1];
        arr[outofplace] = temp;
    }
	
	
	    public static void printArray(int arr[], int n) {
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	}

}
