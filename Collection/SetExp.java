package Collection;

import java.util.*;

public class SetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set=new HashSet<>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.add("Gautam");
		set.add("Karan");
		set.add("Ajay");
		set.add("Karan");
		System.out.println(set);
		
		for(String x:set) {
			System.out.println(x);
		}
		System.out.println("\n");
		LinkedHashSet<String>lset=new LinkedHashSet<>();
		lset.add("Ravi");
		lset.add("Vijay");
		lset.add("Ravi");
		lset.add("Ajay");
		lset.add("null");
		
		System.out.println(lset);
		
		for(String x:lset) {
			System.out.println(x);
		}
		
		System.out.println("\n");
		SortedSet<String>sset=new TreeSet<>();
		sset.add("Ravi");
		sset.add("Vijay");
		sset.add("Ravi");
		sset.add("Ajay");
		
		
		System.out.println(sset);
		
		for(String x:sset) {
			System.out.println(x);
		}
	}

}
