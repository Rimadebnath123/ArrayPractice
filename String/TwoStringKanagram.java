package String;

import java.util.HashMap;

//Check if two strings are k-anagrams or not
//Time Complexity: O(n),Space Complexity: O(n)
public class TwoStringKanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "anagram";
	        String str2 = "grammar";
	        int k = 3;
	        if (areKAnagrams(str1, str2, k))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	}
	public static boolean areKAnagrams(String str1, String str2, int k) {
		
        if (str1.length() != str2.length()) {
            return false; // Different lengths mean they cannot be K-anagrams
        }
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        // Count frequency of each character in str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        
        // Count frequency of each character in str2
        for (char ch : str2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        
        int Count = 0;
        
        // Compare frequencies in both maps
        for (char ch : map1.keySet()) {
            int freq1 = map1.get(ch);
            //System.out.println(freq1);
            int freq2 = map2.getOrDefault(ch, 0);//If ch = 'g', and map2 contains the entry 'g' -> 1, then map2.getOrDefault('g', 0) returns 1.otherwise return 0.
           // System.out.println("2nd "+freq2);
            
            if (freq1 > freq2) {
                Count += freq1 - freq2;
               // System.out.println("c "+Count);
            }
        }
        
        // Check if the differences are within the allowed number of changes
        return Count <= k;
    }

}
