package Arrays;
//Find the Factorial of a large number
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//class Result {
// /* Complete the 'extraLongFactorials' function below. The function accepts INTEGER n as parameter.*/
//
//    public static void extraLongFactorials(int n) {
//    // Write your code here
//   BigInteger fact = BigInteger.ONE; // Initialize factorial as 1
//for(int i=1;i<=n;i++){
//    fact = fact.multiply(BigInteger.valueOf(i));
//}
//System.out.println("Factorial is"+fact);
//    }
//
//}
//
//public class FactorialOfLarge {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        Result.extraLongFactorials(n);
//
//        bufferedReader.close();
//    }
//}


public class FactorialOfLarge {
	 static void extraLongFactorials(int n) {
	    // Write your code here
	   BigInteger fact = new BigInteger("1"); // Initialize factorial as 1
	   
	for(int i=1;i<=n;i++){
	    fact = fact.multiply(BigInteger.valueOf(i));
	}
	System.out.println("Factorial is "+fact);
	 }
	
	 public static void main(String[] args) throws Exception {
		 int N = 500;
	     extraLongFactorials(N);
		 
	 }
}


