package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrLE1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<>();
		list1.add("Ravi");
		list1.add("vijay");
		list1.add("Ravi");
		list1.add("Ajay");
		
		//Collections.sort(list1);
		//Iterator itr=arr.iterator();
		for(String x:list1) {
			System.out.println(x); 
		}
		
		System.out.println("Traversing list through List Itarator:");
		ListIterator<String>list=list1.listIterator(list1.size());
		while(list.hasPrevious()){
			String str=list.previous();
			System.out.println(str);
		}
		System.out.println("Traverse list through for loop:");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("Traverse list through forEach()method:");
		list1.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Traverse list through forEachRemaining()method:");
		Iterator <String>itr=list1.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
}
}
