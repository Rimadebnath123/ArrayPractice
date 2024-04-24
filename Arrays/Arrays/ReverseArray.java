package Arrays;
//Array reverse or reverse a array
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		
		System.out.println("Original array is:");
		
		 for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
		 
		 System.out.println("\n");
		 System.out.println("Reverse array is:");
		 
	 for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}

}
