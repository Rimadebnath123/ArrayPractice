package String;
import java.util.Scanner;

public class ASciiValueCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        char[] charArray = new char[10];

		        // Accept characters into the array
		        System.out.println("Enter 10 characters:");
		        for (int i = 0; i < 10; i++) {
		            charArray[i] = sc.next().charAt(0);
		        }

		        // Find the characters with the highest and lowest ASCII values
		        char maxChar = charArray[0];
		        char minChar = charArray[0];

		        for (int i = 1; i < charArray.length; i++) {
		            if (charArray[i] > maxChar) {
		                maxChar = charArray[i];
		            }
		            if (charArray[i] < minChar) {
		                minChar = charArray[i];
		            }
		        }

		        // Display the results
		        System.out.println("Character with the highest ASCII value: " + maxChar + " (ASCII: " + (int) maxChar + ")");
		        System.out.println("Character with the lowest ASCII value: " + minChar + " (ASCII: " + (int) minChar + ")");

	sc.close();
	}

}
