package Arrays;

import java.util.HashSet;

//Longest Consecutive Subsequence o(1),o(n)
//Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order. 
public class LongestConsecuSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		int n=arr.length;
		System.out.println(
	            "Length of the Longest consecutive subsequence is "
	            + findLongConseqSubseq(arr, n));
	}
	public static int findLongConseqSubseq(int arr[], int n) {
		HashSet<Integer>S=new HashSet<Integer>();
		int len=0;
		for(int i=0;i<n;i++) {
			S.add(arr[i]);
		}
		for(int i=0;i<n;i++) {
			
			if(!S.contains(arr[i]-1)) {
				int j=arr[i];
				while(S.contains(j)) {
					j++;
				}
				if(len<j-arr[i]) {
					len=j-arr[i];
				}
				
			}
		}
		return len;
	
	}

}
