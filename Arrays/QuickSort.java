package Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        quickSort(arr,0,n-1);
        printArr(arr);
	}
	
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static int partition(int arr[],int low,int high) {
		int piov=arr[high];
		int i=(low-1);
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<piov) {
				i++;
				swap(arr,i,j);
			}
			
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	static void quickSort(int arr[],int low, int high) {
		if(low<high) {
			int part=partition(arr,low,high);
			
			// Separately sort elements before
            // partition and after partition
			quickSort(arr,low,part-1);
			quickSort(arr,part+1,high);
		}	
	}
	static void printArr (int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
}
