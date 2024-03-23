import java.util.Scanner;
public class Swap {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the 1st no:");
	 int a=sc.nextInt();
	 System.out.println("Enter the 2nd no:");
	 int b=sc.nextInt();
	 int temp;
	 
//	 a=a+b;
//	 b=a-b;
//	 a=a-b;
	 temp=a;
	 a=b;
	 b=temp;
	 System.out.println("After swapping: "+a +"  " + b);   
	 
	 
	 
 }
}
