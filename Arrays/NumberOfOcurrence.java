package Arrays;
//Number of Ocurrencer
public class NumberOfOcurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 1, 2, 2, 2, 2, 3};
		int count=0;
		int x=2;
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				count++;
			}
		}
		System.out.println("The no of ocurrence is:"+count);
		
//		public static void main(String[] args) {
//		    int arr[]= {1, 1, 2, 2, 2, 2, 3};
//		    int x=2;
//			System.out.println(NumberOfOcurrence(arr,x));	
//		}
//		  static int NumberOfOcurrence(int arr[],int x){
//		    
//			int count=0;
//			
//			for(int i=0;i<arr.length;i++) {
//				if(x==arr[i]) {
//					count++;
//				}
//			}
//				return count;
//			
//		}
//	
		
		
	}

}
