package String;
//10words in array and find sum of ascii code from 1st two alphabet
//from each word stored in another integer arr and sort the sum 
//of asii code and print with word

import java.util.Arrays;
import java.util.Scanner;

public class WordAsciiSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String words[]=new String[10];	
		int asciiSums[]=new int[10];
		System.out.println("Enter 10 words:");
		for(int i=0;i<10;i++) {
			words[i]=sc.next();
		}
		//calculate sum
		for(int i=0;i<10;i++) {
			String word=words[i];
			if(word.length()>=2) {
				asciiSums[i]=(int)word.charAt(0)+(int)word.charAt(1);
			}
			else if(word.length()==1) {
				asciiSums[i]=(int)word.charAt(0);
			}
			else {
				asciiSums[i]=0;//if the word is empty
			}
		}
		//create an array of pairs(asciiSum,word)
		String sortedWord[]=new String[10];
		for(int i=0;i<10;i++) {
			sortedWord[i]=asciiSums[i]+" "+words[i];
		}
		
	
		Arrays.sort(sortedWord,(a,b)->{         //parseInt converts the string representation of the ASCII sum into an integer.
			int sumA=Integer.parseInt(a.split(" ")[0]);//splits the string a on the space character and retrieves the first part, which is the ASCII sum.
			int sumB=Integer.parseInt(b.split(" ")[0]);//retrieves the ASCII sum from the string b.
			return sumA-sumB; //If sumA is less than sumB, it returns a negative value, meaning a should come before b.
			//If sumA is greater than sumB, it returns a positive value, meaning b should come before a.If they are equal, their order remains the same.
			});
		System.out.println("Sorted sums with corresponding words:");
		
//		for(String entry:sortedWord) {
//			System.out.println(entry);		
//		}
		
		//print sorted array
		for (int i = 0; i < sortedWord.length; i++) {
		    System.out.println(sortedWord[i]);
		}
		sc.close();
		
	}

}
