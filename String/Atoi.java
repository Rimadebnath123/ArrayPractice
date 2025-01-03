package String;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  -0012g4";
        System.out.println(myAtoi(s));
	}
	 static int myAtoi(String s) {
	        int sign = 1, res = 0, idx = 0;

	        // Ignore leading whitespaces
	        while (idx < s.length() && s.charAt(idx) == ' ') {
	            idx++;
	        }

	        // Store the sign of number
	        if (idx < s.length() && (s.charAt(idx) == '-' 
	                                 || s.charAt(idx) == '+')) {
	            if (s.charAt(idx++) == '-') {
	                sign = -1;
	            }
	        }

	        // Construct the number digit by digit
	        while (idx < s.length() && s.charAt(idx) >= '0' 
	                                       && s.charAt(idx) <= '9') {
	            
	            // Handling overflow/underflow test case
	            if (res > Integer.MAX_VALUE / 10 || 
	                   (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
	                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	          
	            // Append current digit to the result
	            res = 10 * res + (s.charAt(idx++) - '0');
	        }
	        return res * sign;
	    }

}

//s = " -0012g4", the first two characters are spaces.
//After skipping spaces, idx = 2 (pointing to the - character).
//s.charAt(2) is -, so:
//sign = -1.
//idx increments to 3, pointing to the first digit (0).
//res = 10 * res + (s.charAt(idx++) - '0');
//idx = 3: Character is 0, res = 0.
//idx = 4: Character is 0, res = 0.
//idx = 5: Character is 1, res = 1.
//idx = 6: Character is 2, res = 12.
//idx = 7: Character is g (non-digit), loop stops.
