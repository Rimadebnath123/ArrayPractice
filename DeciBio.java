import java.util.Scanner;
public class DeciBio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the no:");
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int base=1,rem=0,bin=0;
	       while(n>0)
	       {
	           rem=n%2;
	           n=n/2;
	           bin=bin+(rem*base);
	           base=base*10;
	       }
	    System.out.print("Binary no is:"+bin)   ;
	}

}
