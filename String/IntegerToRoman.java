package String;
//Converting Decimal Number lying between 1 to 3999 to Roman Numerals//o(n) o(n)
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 3549;
	        System.out.println(intToRoman(number));

	}
//	 static String intToRoman(int num)
//	    {
//	        // storing roman values of digits from 0-9
//	        // when placed at different places
//	        String m[] = { "", "M", "MM", "MMM" };
//	        String c[] = { "",  "C",  "CC",  "CCC",  "CD",
//	                       "D", "DC", "DCC", "DCCC", "CM" };
//	        String x[] = { "",  "X",  "XX",  "XXX",  "XL",
//	                       "L", "LX", "LXX", "LXXX", "XC" };
//	        String i[] = { "",  "I",  "II",  "III",  "IV",
//	                       "V", "VI", "VII", "VIII", "IX" };
//	 
//	        // Converting to roman
//	        String thousands = m[num / 1000];
//	        String hundreds = c[(num % 1000) / 100];
//	        String tens = x[(num % 100) / 10];
//	        String ones = i[num % 10];
//	 
//	        String ans = thousands + hundreds + tens + ones;
//	 
//	        return ans;
//	    }
	static String intToRoman(int num)
	  {
	//Initialize the ans string
	    String ans = "";
	  //calculate the roman numbers
	    while (num>0) {
	        if (num >= 1000) {
	            ans += "M";
	            num -= 1000;
	        }
	      //check for all the corner cases like 900,400,90,40,9,4 etc.
	        else if (num >= 900 && num < 1000) {
	            ans += "CM";
	            num -= 900;
	        }
	        else if (num >= 500 && num < 900) {
	            ans += "D";
	            num -= 500;
	        }
	        else if (num >= 400 && num < 500) {
	            ans += "CD";
	            num -= 400;
	        }
	        else if (num >= 100 && num < 400) {
	            ans += "C";
	            num -= 100;
	        }
	        else if (num >= 90 && num < 100) {
	            ans += "XC";
	            num -= 90;
	        }
	        else if (num >= 50 && num < 90) {
	            ans += "L";
	            num -= 50;
	        }
	        else if (num >= 40 && num < 50) {
	            ans += "XL";
	            num -= 40;
	        }
	        else if (num >= 10 && num < 40) {
	            ans += "X";
	            num -= 10;
	        }
	        else if (num == 9) {
	            ans += "IX";
	            num -= 9;
	        }
	        else if (num >= 5 && num < 9) {
	            ans += "V";
	            num -= 5;
	        }
	        else if (num == 4) {
	            ans += "IV";
	            num -= 4;
	        }
	        else if (num < 4) {
	            ans += "I";
	            num--;
	        }
	    }
	  //return the result
	    return ans;
	}

}
