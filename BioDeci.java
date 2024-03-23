import java.util.Scanner;

public class BioDeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no:");
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int base=1,rem=0,deci=0;
	       while(n>0)
	       {
	           rem=n%10;
	           n=n/10;
	           deci=deci+(rem*base);
	           base=base*2;
	       }
	    System.out.print("decimal no is:"+deci)   ;
	}

}
