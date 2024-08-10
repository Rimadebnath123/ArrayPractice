package String;

import java.util.Scanner;
//convert each character to second next
public class ConvertCharNextTwo {

	public static void main(String[] args) {
//	String s = "I am a girl";
		// TODO Auto-generated method stub
		
//		
//        String[] words = s.split(" ");
//        String con = "";
//
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            for (int j = 0; j < word.length(); j++) {
//                char ch = word.charAt(j);//take char
//                con += (char)(ch + 2);//it convert Ascii value thenconvert charecter using char
//            }
//            con += " "; // Add a space after each word
//        }
//
//        System.out.println(con.toUpperCase().trim()); // Print the result without space for trim
//    
//	}
		 Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
		
		String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);           
            result += getNextChar(ch);;
        }
        sc.close();
        System.out.println("Converted sentence:");
        System.out.println(result);
    }

    private static char getNextChar(char ch) {
        if (ch >= 'A' && ch <= 'X') {
            return (char)(ch + 2);
        } else if (ch == 'Y') {
            return 'A';
        } else if (ch == 'Z') {
            return 'B';
        } else if (ch >= 'a' && ch <= 'x') {
            return (char)(ch + 2);
        } else if (ch == 'y') {
            return 'a';
        } else if (ch == 'z') {
            return 'b';
        } else {
            return ch; // Non-alphabet characters remain the same
        }
    }	   

}
