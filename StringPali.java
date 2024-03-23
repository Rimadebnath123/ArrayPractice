import java.util.Scanner;
public class StringPali {

	public static void main(String[] args) {
		 System.out.println("Enter the string:");
		        Scanner sc= new Scanner(System.in);
		      String s=sc.nextLine();
		      String rev="";
		  
		      for(int i=s.length()-1;i>=0;i--)
		      {
		          rev=rev+s.charAt(i);
		      }
		     if(s.equals(rev))
		         System.out.println("strin p");
		     else
		     System.out.println("np");
		    }
		}



