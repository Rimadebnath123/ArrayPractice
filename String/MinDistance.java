package String;
//Find the minimum distance between the given two words.Time Complexity: O(N*L), where N is number of strings and L is size of maximum string.
//Auxiliary Space: O(1)
public class MinDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] S
	        = { "the", "quick", "brown", "fox", "quick" };
	 
	    String word1 = "the", word2 = "fox";
	 
	    // Function Call
	    System.out.println(shortestDistance(S, word1, word2));
	    }
	public static int shortestDistance(String[]S,String word1, String word2) {
		int d1=-1,d2=-1,ans=Integer.MAX_VALUE;
		for(int i=0;i<S.length;i++) {
			if(S[i]==word1) {
				d1=i;
			}
			if(S[i]==word2) {
				d2=i;
			}
			if(d1!=-1 && d2!=-1) {
				ans=Math.min(ans,Math.abs(d1-d2));
			}
		}
		
		return ans;
		
	}

}
