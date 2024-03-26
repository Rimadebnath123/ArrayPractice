package Arrays;
import java.util.*;
//Program to find the minimum (or maximum) element of an array
public class MinMax {
//1st process	
//	public static void main(String[] args) {
////		int a[]={1,423,6,46,34,23,13,53,4}; 
//		int a[] = { 12, 1234, 45, 67, 1 };
//		int min=1,max=0;
//		int mi=0,ma=0;
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]<=a[i+1]) {
//				mi=a[i];
//				if(min>=mi) {
//					min=mi;
//				}
//			}
//			else {
//				ma=a[i];
//				if(max<=ma) {
//					max=ma;
//				}
//			}
//		}
//System.out.println("the max no is:"+max);
//System.out.println("the min no is:"+min);
//	}
//2nd process	
	public static void main(String[] args) {
		int a[]={1,423,6,46,34,23,13,53,4}; 
		//int a[] = { 12, 1234, 45, 67, 1 };
		int min=1,max=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<=a[i+1]) {
				min = Math.min(min, a[i]);
				
			}
			else {
				max = Math.max(max, a[i]);
				
			}
				
		}
System.out.println("the max no is:"+max);
System.out.println("the min no is:"+min);
}
}
