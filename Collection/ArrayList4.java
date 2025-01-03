package Collection;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("An initial list of elements:"+al);
		al.remove("Vijay");
		System.out.println("After invoking remove(object)method:"+al);
		al.remove(0);
		System.out.println("After invoking remove(index)method:"+al);
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al.addAll(al2);
		System.out.println("Update list:"+al);
		al.removeAll(al2);
		System.out.println("After invoking removeAll()method:"+al);
		al.removeIf(str ->str.contains("Ajay"));
		System.out.println("After invoking removeIf()method:"+al);
		al.clear();
		System.out.println("After invoking clear()method:"+al);
	}

}
