package String;

import java.util.HashMap;
//Given a string, find the count of distinct subsequences of it.
//Time Complexity: O(n),sp-o(n)
public class subSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abc";
	        System.out.println("Distinct subsequences count: " + countDistinctSubsequences(s));
	}
	 public static int countDistinctSubsequences(String s) {
	        int n = s.length();
	        int[] dp = new int[n + 1]; // dp[i] will store the count of distinct subsequences until index i
	        dp[0] = 1; // Base case: an empty string has one subsequence, which is an empty subsequence

	        HashMap<Character, Integer> lastOccurrence = new HashMap<>();

	        for (int i = 1; i <= n; i++) {
	            char currentChar = s.charAt(i - 1);

	            // Double the number of subsequences formed by the previous characters
	            dp[i] = 2 * dp[i - 1];

	            // If the current character has appeared before, subtract the count of subsequences 
	            // formed by the string until the last occurrence of this character to remove duplicates
	            if (lastOccurrence.containsKey(currentChar)) {
	                int lastIndex = lastOccurrence.get(currentChar);
	                dp[i] -= dp[lastIndex - 1];//If the character appeared earlier, we subtract the number of subsequences formed until its last occurrence, as these subsequences would now be duplicated.
	            }

	            // Update the last occurrence of the current character
	            lastOccurrence.put(currentChar, i);
	        }

	
	        return dp[n];
	    }


}
//s = "abc"
//n = 3
//dp = [1, 0, 0, 0]
//lastOccurrence = {}
//Iteration 1 (i = 1):

//Current character: currentChar = 'a'
//dp[1] = 2 * dp[0] = 2 * 1 = 2
//No previous occurrence of 'a'.
//Update lastOccurrence: lastOccurrence = {'a': 1}
//dp = [1, 2, 0, 0]