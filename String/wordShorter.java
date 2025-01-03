package String;
import java.util.Scanner;

public class wordShorter {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] words = new String[10];
	        
	        
	        System.out.println("Enter 10 words:");
	        for (int i = 0; i < 10; i++) {
	            words[i] = sc.nextLine();
	        }
	        
	        // Sort the words by length using Bubble Sort 
	        for (int i = 0; i < words.length - 1; i++) {
	            for (int j = 0; j < words.length - i - 1; j++) {
	                if (words[j].length() > words[j + 1].length()) {
	                    // Swap words[j] and words[j + 1]
	                    String temp = words[j];
	                    words[j] = words[j + 1];
	                    words[j + 1] = temp;
	                }
	            }
	        }
	        
	        
	        System.out.println("Words sorted by length:");
	        for (int i = 0; i < words.length; i++) {
	            System.out.println(words[i]);
	        }
	        
	        sc.close();
	    }
	}



