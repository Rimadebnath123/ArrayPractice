package String;
//Check if two given Strings are Isomorphic to each other
//Time Complexity: O(N2), traversing over the string of size N.Auxiliary Space: O(N)
import java.util.*;

public class IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aab";
		String s2="xxy";
		if(s1.length()==s2.length() && aisomorphic(s1,s2)) {
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("False");
		}
	}
	public static boolean aisomorphic(String s1,String s2) {
		char c='a';
		HashMap <Character,Character> map= new HashMap<Character,Character>();
		for(int i=0;i<s1.length();i++) {
			if(map.containsKey(s1.charAt(i))) {
				c=map.get(s1.charAt(i));
				if(c!=s2.charAt(i)) {
					return false;
				}
			}
			else if(!map.containsValue(s2.charAt(i))) {
				map.put(s1.charAt(i),s2.charAt(i));
			}
			else {
				return false;
			}
		} return true;
			
		
	}

}
