package String;
//Time Complexity: O(N*M)
//Auxiliary Space: O(N)
//How to replace a substring of a string
public class ReplaceSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "geeksforgeeks";
	    String S1 = "eek";
	    String S2 = "ok";
	    modifyString(S, S1, S2);
	}
	static void modifyString(String s, String s1, String s2)
	  {
	    String ans = "";
	    for (int i = 0; i < s.length(); i++) {
	      int k = 0;
	 
 // If the first character of String s1 matches with the current character in String s
	      if (s.charAt(i) == s1.charAt(k) && i + s1.length() <= s.length()) {
	        int j;
	        // If the complete String
	        // matches or not
	        for (j = i; j < i + s1.length(); j++) {
	          if (s.charAt(j) != s1.charAt(k)) {
	            break;
	          }
	          else {
	            k = k + 1;
	          }
	        }
	 
	        // If complete String matches
	        // then replace it with the
	        // String s2
	        if (j == i + s1.length()) {
	          ans += (s2);
	          i = j - 1;
	        }
	 
	        // Otherwise
	        else {
	          ans += (s.charAt(i));
	        }
	      }
	 
	      // Otherwise
	      else {
	        ans += (s.charAt(i));
	      }
	    }
	 
	    // Print the resultant String
	    System.out.print(ans);
	  }

}
//Iteration 1 (i = 0):
//S[0] = 'g'.
//Compare S[0] with S1[0] = 'e': No match.
//Append 'g' to ans.
//Move to the next character (i = 1).
//State:  ans = "g"
//Iteration 2 (i = 1):
//S[1] = 'e'.
//Compare S[1] with S1[0] = 'e': Match found.
//Start Nested Loop:
//j = 1 (current index in S), k = 0 (index in S1).
//Compare S[j] with S1[k]:
//S[1] == S1[0]: Match (j = 1, k = 0).
//S[2] == S1[1]: Match (j = 2, k = 1).
//S[3] == S1[2]: Match (j = 3, k = 2).
//Full match (j == i + S1.length()).
//Replace S1 with S2 ("ok") in ans.
//Skip to the character after the match (i = 3).
//State:ans = "gok"
//Iteration 3 (i = 4):
//S[4] = 's'.
//Compare S[4] with S1[0] = 'e': No match.
//Append 's' to ans.
//Move to the next character (i = 5).
