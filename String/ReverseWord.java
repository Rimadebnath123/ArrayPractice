package String;
//Reverse words in a given string  o(n),o(n)
public class ReverseWord {

	public static void main(String[] args) {
		
	        String str = "i love programming very much";
	        String[] words = str.split(" ");//split this string using space,store it in words array
	        String rev = "";

	        for (int i = words.length - 1; i >= 0; i--) {
	            rev += words[i];
	            if (i > 0) {
	                rev += " ";
	            }
	        }

	        System.out.println(rev);
	    }
	
	  

}
