package Arrays;

//Given an array of positive and negative numbers,the task is to find if there is a subarray (of size at least one) with 0 sum.
public class subArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4, 2, -3, 1, 6};
		int n=arr.length;
		
		 if(findSub(n,arr)) {
		System.out.println("found subArray");
		 }
		 else {
			 System.out.println(" not found subArray");
		 }

	}
	public static boolean findSub(int n, int arr[]) {
		
		for(int i=0;i<n;i++) {
			int sum=arr[i];
			
			if(sum==0) {
				return true;				
			}
			for(int j=i+1;j<n;j++) {
				sum+=arr[j];//sum multiple times
				//System.out.println(sum);
				if(sum==0) {
					return true;
				}
			}
		}
		return false;
	}

}
