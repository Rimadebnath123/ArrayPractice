package Collection;

import java.util.*;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
	System.out.println("After invoking add(E e)method:"+al);
	al.add(1,"Gaurav");
	System.out.println("After invoking add(int index,Element e)method:"+al);
	ArrayList<String> al1=new ArrayList<>();
	al1.add("Sonoo");
	al1.add("Hanumat");
	
	al.addAll(al1);
	System.out.println("After invoking addAll(Collection<?extends E>c)method:"+al);
		
	ArrayList<String> al2=new ArrayList<>();
	al2.add("John");
	al2.add("Rahul");
	
	al.addAll(1,al2);
	System.out.println("After invoking addAll(int index ,Collection<?extends E>c)method:"+al);
	
	}

}
