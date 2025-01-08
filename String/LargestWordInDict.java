package String;
//Find largest word in dictionary by deleting some characters of given string
//Time Complexity: O(nlogn+n⋅L)
//Space Complexity: O(n+L)
import java.util.*;
public class LargestWordInDict {

	public static void main(String[] args) {
		ArrayList<String> dict=new ArrayList<String>(Arrays.asList("ale", "apple", "monkey", "plea"));
		String str="abpcplea";
		System.out.println(LongestWord(dict, str));
		
	}
	static String LongestWord(ArrayList<String>d,String S) {
		Collections.sort(d);
		for(String c:d) {
			check(c,S);
		}
		return res;
	}
	
	static String res="";
	static void check(String d,String S) {
		int i=0;
		int j=0;
		while(i<d.length() && j<S.length()) {
			if(d.charAt(i)==S.charAt(j)) {
				i+=1;
				j+=1;
			}
			else {
				j+=1;
			}
			
			if(i==d.length() && res.length() <d.length()) {
				res=d;
			}
		}
	}

}

//d = "apple" (dictionary word)
//s = "abpcplea" (string)
//i = 0, j = 0
//d[0] = 'a', s[0] = 'a'
//i = 1, j = 1
//d[1] = 'p', s[1] = 'b'
//i = 1, j = 2
//d[1] = 'p', s[2] = 'p'
//i = 2, j = 3
//d[2] = 'p', s[3] = 'c' → No match → Increment j.
//d[2] = 'p', s[4] = 'p' → Match → Increment both pointers.
//d[3] = 'l', s[5] = 'l' → Match → Increment both pointers.
//d[4] = 'e', s[6] = 'e' → Match → Increment both pointers.
//i = 5, j = 7 → All characters in d matched.
//d.length() = 5, res.length() = 0 → Update res=apple

