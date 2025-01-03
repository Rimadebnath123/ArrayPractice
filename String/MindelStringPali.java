package String;
//Time Complexity: O(2^n)Space Complexity: O(n)
public class MindelStringPali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abefbac";
	    
	    System.out.println("Minimum element of deletions = " +
	                       mineledel(str));
	}
	public static int mineledel(String str)
	{
	    
	    // Utility function call
	    return utidel(str, 0, str.length() - 1);
	}
	
	public static int utidel(String str,int i,int j) {
		if(i>=j) {
			return 0;
		}
		if(str.charAt(i)==str.charAt(j)) {
			return utidel(str,i+1,j-1);
		}
		else {
			return 1 + Math.min(utidel(str,i+1,j),utidel(str,i,j-1));//The function returns 1 + the minimum of the deletions from these two recursive calls. The 1 + accounts for the one deletion performed in the current step.
		}//Deleting the character at position i
		//Deleting the character at position j
	}

}
//"abefbac"
//utidel("abefbac", 0, 6)
//utidel("abefbac", 1, 6) (deleting a)
//utidel("abefbac", 0, 5) (deleting c)
//utidel("abefbac", 1, 6)
//utidel("abefbac", 0, 5) befb//recurrsive the loop
