package Arrays;
//sort a array in Ascending order:
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 0, 23, 14, 12, 9 };
		 int temp=0;
		 for(int i=0;i<arr.length;i++) { 
		for(int j=i+1;j<arr.length;j++) {
			  if(arr[i] > arr[j]) {    
                  temp = arr[i];    
                  arr[i] = arr[j];    
                  arr[j] = temp;    
              }     
			
		}
		 }
		  System.out.println("Elements of array sorted in ascending order: ");   
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 }
	}


