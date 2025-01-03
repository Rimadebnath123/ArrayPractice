package String;
//Check if two strings are k-anagrams or not//time,soace-o(n)
import java.util.*;
public class Kanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s1="anagram",s2="gramma";
		int k=2;
		 if (areAnagram(s1, s2, k)) {
	            System.out.print("Yes");
	        } else {
	            System.out.print("No");
	        }
	}
		
		public static boolean areAnagram(String s1,String s2,int k) {
			
			if(s1.length()!=s2.length()) {
				return false;
			}
			Map<Character,Integer>map= new HashMap<>();
			
			for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(i);
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
			
			for(int i=0;i<s2.length();i++) {
				char ch=s2.charAt(i);
				if(map.getOrDefault(ch,0)>0) {
				map.put(ch,map.getOrDefault(ch,0)-1);
				}
			}
			
			int c=0;
			for(char ch:map.keySet()) {
				c+=map.get(ch);
			}
			if(c>k) {
				return false;
			}
			else {
				return true;
			}
				
		}
	
	}

