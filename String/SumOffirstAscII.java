package String;
import java.util.Scanner;
public class SumOffirstAscII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc= new Scanner(System.in);
		        String[] words = new String[10];
		        int sumOfAscii = 0;
		        
		        // Loop to get input of 10 words
		        System.out.println("Enter 10 words:");
		        for (int i = 0; i < 10; i++) {
		            words[i] = sc.nextLine();
		            // Get the ASCII value of the first character of the word
		            if (!words[i].isEmpty()) {
		                sumOfAscii += words[i].charAt(0);
		            }
		        }
		        
		        // Print the sum of ASCII codes of the first character from each word
		        System.out.println("Sum of ASCII codes of first characters: " + sumOfAscii);
		        
		        // Close the scanner
		        sc.close();
		    }
		}
