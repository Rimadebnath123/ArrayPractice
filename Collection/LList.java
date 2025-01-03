package Collection;

import java.util.LinkedList;
import java.util.Vector;

public class LList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forLinked list
		LinkedList<String> l=new LinkedList<>();
		
		l.add("Amit");
		l.add("ujal");
		l.add("Anup");
		l.add("Amit");
		System.out.println(l);
		
		for(String i:l) {
			System.out.println(i);
		}
System.out.println("\n");		
Vector<String> ll=new Vector<>();
		
		ll.add("Amit");
		ll.add("ujal");
		ll.add("Anup");
		ll.add("Amit");
		
		for(String x:ll) {
			System.out.println(x);
		}
		
	}

}
