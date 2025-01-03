package String;
//Time Complexity:O(n), Space Complexity: O(1) 
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
        if (checkPangram(str))
            System.out.println("It is a Pangram");
        else
            System.out.println("It is Not a Pangram");

	}
	 static boolean checkPangram(String str) {
		 boolean[] mark = new boolean[26];
	        
	        // Convert the string to lowercase
	        str = str.toLowerCase();//o(n)
	        
	        // Iterate through each character of the string o(n)
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            // Mark the character as visited in the mark[] array
	            if ('a' <= ch && ch <= 'z') {
	                mark[ch - 'a'] = true;
	            }
	        }
	        
	        // Check if all characters are marked O(1)
	        for (int i = 0; i < 26; i++) {
	            if (!mark[i]) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	 

}
//Character 1: 't',ch = 't',Index = 't' - 'a' = 19,Mark mark[19] = true
