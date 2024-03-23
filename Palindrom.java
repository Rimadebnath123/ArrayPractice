import java.util.*;
public class Palindrom{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no:");
        int n= sc.nextInt();
        int temp=n;
        int sum=0,r;
        while(n>0){
            r=n%10;
            sum=r+(sum*10);
            n=n/10;
            
        }
        if(temp==sum)
             System.out.println("p");
        else
            System.out.println("np");
     }
}
