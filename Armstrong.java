import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the no:");
	    int n=sc.nextInt();
	    int temp,rem,sum=0;
	    temp=n;
	    while(n>0){
	        rem=n%10;
	        sum=sum+(rem*rem*rem);
	        n=n/10;
	    }
	    if(temp==sum){
	        System.out.println("a");
	    }
	    else
	    System.out.println("na");
	    }
	}


