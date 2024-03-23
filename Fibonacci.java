import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	         System.out.println("Enter the no:");
	        int n= sc.nextInt();
	        int n1=0,n2=1,n3,i=2;
	        System.out.print("Fibonacci series:"+n1+" "+n2+" ");
	        while(i<n)
	        {
	        	n3=n1+n2;
	        	System.out.print(n3+" ");
	        	n1=n2;
	        	n2=n3;
	        	i++;
	        } 
	}

}
