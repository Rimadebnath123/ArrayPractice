 package Collection;

import java.util.*;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Ravi");
		al2.add("Hanumat");
//		
		al.retainAll(al2);
		System.out.println("Iterating the elements after retaining the elements of al2");
		Iterator itr=al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
			ArrayList<String> al1=new ArrayList<>();
			System.out.println("Is arraylist empty:"+al1.isEmpty());
			al1.add("Ravi");
			al1.add("Vijay");
			al1.add("Ajay");
			System.out.println("After Insertion");
			System.out.println("Is arraylist empty:"+al1.isEmpty());
		
	}

}
