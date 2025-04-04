package String;
//Longest Common Prefix using Sorting
public class LongestCommonPrefix {

	public static void main(String[] args){
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println( "The longest Common Prefix is : " +
                                   longestCommonPrefix(input));
    	}
	
	public static String longestCommonPrefix(String[] arr)
    {
		// Java program to find longest common prefix of
		// given array of words.
		       int n = arr.length;
		       // take temp_prefix string and assign first element of arr : a.
		       String result = arr[0];
		      
		       // Iterate for rest of element in string.
		       for(int i = 1; i < n; i++){
		            // .indexOf() return index of that substring from string.
		            while(arr[i].indexOf(result) != 0){
		              
		                // update matched substring 
		                result = result.substring(0, result.length()-1);//geeksforgeek
		              
		                // check for empty case. direct return if true..
		                if(result.isEmpty()){
		                    return "-1";
		                }
		            }
		        }
		        return result;
		    }

	
	}


