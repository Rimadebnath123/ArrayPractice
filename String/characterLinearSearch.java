package String;
import java.util.*;
public class characterLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        char[] charArray = sentence.toCharArray();

        System.out.println("The characters in the array are: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Input a character to search in the array
        System.out.println("Enter the character to search: ");
        char searchChar = sc.next().charAt(0);

        int result = linearSearch(charArray, searchChar);

        if (result != -1) {
            System.out.println("Character '" + searchChar + "' found at index " + result);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the array.");
        }

        sc.close();
    }
	 public static int linearSearch(char[] arr, char key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return i; // Return the index of the found character
	            }
	        }
	        return -1; // Return -1 if the character is not found
	    }
}


