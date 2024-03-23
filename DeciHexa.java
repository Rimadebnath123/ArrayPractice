import java.util.Scanner;

public class DeciHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the no:");
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	      char hexachar[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	       int rem=0;String hexa="";
	       while(n>0)
	       {
	           rem=n%16;
	           hexa=hexachar[rem]+hexa;
	           n=n/16;
	       }
	    System.out.print("hexa no is:"+hexa)   ;
	}
	}


