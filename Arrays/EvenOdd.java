package Arrays;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=20;
		int arr[]=new int[size];
		int even[]=new int[size];
		int odd[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			//System.out.print(arr[i]+" ");
		}
		sc.close();
		
	int j=0,k=0;	
	for(int i=0;i<size;i++) {
	if(arr[i]%2==0) {
		even[j++]=arr[i];
	}else {
		odd[k++]=arr[i];
	}
			
		}
	
	System.out.println("Even numbers:");
		for(int i=0;i<j;i++) {
			System.out.print(even[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("Odd numbers:");
		for(int i=0;i<k;i++) {
			System.out.print(odd[i]+" ");
		}

	}

}
