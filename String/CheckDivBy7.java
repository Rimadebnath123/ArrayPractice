package String;
//Check divisibility by 7
//Time Complexity: O(log n),Auxiliary Space: O(log n)
public class CheckDivBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=616;
		if(isDivisibleBy7(num)) {
            System.out.println("Divisible");
		}
        else {
            System.out.println("Not Divisible");
        }
	}
	public static boolean isDivisibleBy7(int num) {
		// Make the number positive
        num = Math.abs(num);
        //System.out.println(num);
        
        if (num == 0 || num == 7) {
            return true;
        }
        if (num < 10) {
            return false;
        }
  
        // Recur for ( num / 10 - 2 * ( num % 10 ) ) 
        return isDivisibleBy7(num / 10 - 2 * (num % 10));
    }
}
