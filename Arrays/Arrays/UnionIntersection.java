package Arrays;
//Union and Intersection of two sorted arrays
import java.util.*;

public class UnionIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 3, 4, 5, 7};
       int  arr2[] = {2, 3, 5, 6};
       ArrayList<Integer>union= new ArrayList<Integer>();
       ArrayList<Integer> inter= new ArrayList<Integer>();
      
       
       int i = 0, j = 0;
       while (i < arr1.length && j < arr2.length) {
           if (arr1[i] < arr2[j]) {
               union.add(arr1[i]);
               i++;
           } else if (arr1[i] > arr2[j]) {
               union.add(arr2[j]);
               j++;
           } else {
               union.add(arr1[i]);
               inter.add(arr1[i]);
               i++;
               j++;
           }
       }

       // Add remaining elements from arr1, if any
       while (i < arr1.length) {
           union.add(arr1[i]);
           i++;
       }

       // Add remaining elements from arr2, if any
       while (j < arr2.length) {
           union.add(arr2[j]);
           j++;
       }
       
       System.out.println(union);
       System.out.println(inter);
	}

}
