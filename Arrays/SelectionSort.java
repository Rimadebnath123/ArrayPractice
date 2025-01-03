package Arrays;
//o(n2)
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,45,65,34,12,3,9,17,8};
		for(int i=0;i<arr.length;i++) {
			int small=arr[i];
			int pos=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<small) {
					small=arr[j];
					pos=j;
				}
			}
			arr[pos]=arr[i];
			arr[i]=small;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
