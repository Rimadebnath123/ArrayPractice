package String;
//Converting Roman Numerals to Integer//o(n) o(1)
import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String str = "MCMIV";
	        System.out.println(romanToDecimal(str));
	    }

//	 public static int value(char r)
//		    {
//		        if (r == 'I')
//		            return 1;
//		        if (r == 'V')
//		            return 5;
//		        if (r == 'X')
//		            return 10;
//		        if (r == 'L')
//		            return 50;
//		        if (r == 'C')
//		            return 100;
//		        if (r == 'D')
//		            return 500;
//		        if (r == 'M')
//		            return 1000;
//		        return -1;
//		    }

		    // Returns the decimal value of a Roman numeral
//		    public static int romanToDecimal(String str)
//		    {
//		        int res = 0; // Initialize the result
//		        for (int i = 0; i < str.length(); i++) {
//
//		            // Get the value of the current symbol
//		            int s1 = value(str.charAt(i));
//		            System.out.println(s1);
//		            if (i + 1 < str.length()) {
//
//		                // Get the value of the next symbol
//		                int s2 = value(str.charAt(i + 1));
//		                System.out.println(s2);
//		                if (s1 >= s2) {
//
//		                    // If the current value is greater or
//		                    // equal, add it to the result
//		                    res += s1;
//		                    System.out.println("1st"+res);
//		                }
//		                else {
//
//		                    // Else, add the difference and skip the
//		                    // next symbol
//		                    res += (s2 - s1);
//		                    System.out.println("2nd"+res);
//		                    i++;
//		                }
//		            }
//		            else {
//		                // Add the last symbol to the result
//		                res += s1;
//		            }
//		        }
//		        return res;
//		    }

	 public static int romanToDecimal(String str)
	    {
	        HashMap<Character, Integer> romanMap
	            = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int sum = 0;
	        for (int i = 0; i < str.length(); i++) {
	          
	            // If the current value is less than the next
	            // value, subtract current from next and add to
	            // sum
	            if (i + 1 < str.length()
	                && romanMap.get(str.charAt(i))
	                       < romanMap.get(str.charAt(i + 1))) {
	                sum += romanMap.get(str.charAt(i + 1))
	                       - romanMap.get(str.charAt(i));
	                System.out.println("1st"+sum);
	              
	              // Skip the next symbol
	                i++;
	            }
	            else {
	              
	                // Otherwise, add the current value to sum
	                sum += romanMap.get(str.charAt(i));
	                System.out.println("2nd"+sum);
	            }
	        }

	        return sum;	
	}
	 
}

