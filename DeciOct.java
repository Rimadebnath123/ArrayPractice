import java.util.Scanner;

public class DeciOct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the no:");
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int base=1,rem=0,oct=0;
	       while(n>0)
	       {
	           rem=n%8;
	           n=n/8;
	           oct=oct+(rem*base);
	           base=base*10;
	       }
	    System.out.print("octal no is:"+oct)   ;
	}
	}


