package Collection;
import java.util.*;
public class ArrEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<>();
		arr.add("Ravi");
		arr.add("vijay");
		arr.add("Ravi");
		arr.add("vijay");
		System.out.println(arr);
		arr.remove(2);
		//Iterator itr=arr.iterator();
		for(String x:arr) {
			System.out.println(x); 
		}
System.out.println("\n");
Stack<String> ll=new Stack<>();
		
		ll.push("Amit");
		ll.push("ujal");
		ll.push("Anup");
		ll.push("Amit");
		ll.push("Gorima");
		
		System.out.println(ll);
		ll.pop();
		
		for(String x:ll) {
			System.out.println(x);
		}
		

			
				
	}

}
