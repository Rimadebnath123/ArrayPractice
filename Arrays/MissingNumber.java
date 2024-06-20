package Arrays;
//Find the Missing Number
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 4, 6, 3, 7, 8};
		int sum=0;
		int n=arr.length;
		int tsum=((n+1)*(n+2))/2;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int Mnum=tsum-sum;
		System.out.println(Mnum);
	}

}
