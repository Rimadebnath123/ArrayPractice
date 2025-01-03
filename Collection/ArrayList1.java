package Collection;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		Student s1=new Student(100,"Rima",24);
		Student s2=new Student(101,"Riya",23);
		Student s3=new Student(102,"Ridhi",22);
		
		// TODO Auto-generated method stub
ArrayList<Student> al=new ArrayList<>();
al.add(s1);
al.add(s2);
al.add(s3);

for(Student s:al) {
	System.out.println(s.rollno+" "+s.name+" "+s.age);
	}

}
}
