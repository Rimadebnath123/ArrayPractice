package Arrays;
import java.util.Scanner;
public class ArrayuserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the array:");
		int size=sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++) {
			System.out.println("Element"+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("the elements in the array are:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
