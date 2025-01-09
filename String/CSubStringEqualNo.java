package String;

import java.util.*;
//Given a string that consists of only 0s, 1s and 2s, count the number of substrings that have an equal number of 0s, 1s, and 2s.
//Time Complexity: O(N3) 
//Auxiliary Space: O(1)
public class CSubStringEqualNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="0102010";
		System.out.println(getSubstringWithEqual012(str));

	}
	static long getSubstringWithEqual012(String S) {
		ArrayList<String> arr= new ArrayList<>();
		int n=S.length();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				String s1="";
				for(int k=i;k<=j;k++) {
					s1+=S.charAt(k);
				}
				arr.add(s1);
			}
		}
		int count=0;
		 int countZero, countOnes, countTwo;
		 for(int i=0;i<arr.size();i++) {
			 countZero = 0;
	            countOnes = 0;
	            countTwo = 0;
	            String curs = arr.get(i);
	            for(int j=0;j<curs.length();j++) {
	            	
	            	if(curs.charAt(j) =='0') 
	            		countZero++;
	            	 if (curs.charAt(j) == '1')
	                     countOnes++;
	                 if (curs.charAt(j) == '2')
	                     countTwo++;
	            }
	            if (countZero == countOnes
	                    && countOnes == countTwo) {
	                    count++;
	                }
	            }
	     
	            return count;
		
	}

}

//Substring	Count of '0'	Count of '1'	Count of '2'	Condition Met?
//"0"			1				0				0				No
//"01"			1				1				0				No
//"010"			2				1				0				No
//"0102"		2				1				1				No
//"01020"		3				1				1				No
//"010201"		3				2				1				No
//"0102010"		4				2				1				No
//"1"			0				1				0				No
//"10"			1				1				0				No
//"102"			1				1	 			1				Yes
//"1020"		2				1				1				No
//"10201"		2				2				1				No
//"102010"		3				2				1				No
//"0"			1				0				0				No
//"02"			1				0				1				No
//"020"			2				0				1				No
//"0201"		2				1				1				No
//"02010"		3				1				1				No
//"2"			0				0				1				No
//"20"			1				0				1				No
//"201"			1				1				1				Yes
//"2010"		2				1				1				No
//"0"			1				0				0				No
//"01"			1				1				0				No
//"010"			2				1				0				No
//output=2
