package Collection;
import java.io.*;
import java.util.*;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<>();
	al.add("Ravi");
	al.add("Vijay");
	al.add("Ajay");
	
	try {
		//Serialization
		FileOutputStream fos=new FileOutputStream("file");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		fos.close();
		oos.close();
		//DeSerialization
				FileInputStream fis=new FileInputStream("file");
				ObjectInputStream ois=new ObjectInputStream(fis);
				ArrayList list=(ArrayList)ois.readObject();
				System.out.println(list);
	}catch(Exception e){
		System.out.println(e);
	}
		
	}

}
