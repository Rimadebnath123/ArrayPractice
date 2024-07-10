package Arrays;
//Find common elements in three sorted arrays
public class CommEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = {1, 5, 10, 20, 40, 80} ;
		int ar2[] = {6, 7, 20, 80, 100} ;
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} ;
		System.out.print("Common elements are ");
		commonEle(ar1,ar2,ar3);

	}
	public static void commonEle(int arr1[],int arr2[],int arr3[]) {
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length){			
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
				System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
				
			}
			else if (arr1[i] < arr2[j])
                i++;
			
			else if (arr2[j] < arr3[k])
                j++;

            else
                k++;
		}
	}

}
