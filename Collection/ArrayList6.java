package Collection;
import java.util.*;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
	public class ArrayList6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book>al=new ArrayList<>();
		
		Book b1=new Book(101,"Let us c","YashWant","BPB",8);
		Book b2=new Book(102,"Data Communication","Forouzan","MC Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		
		al.add(b1);
		al.add(b2);
		al.add(b3);
		for(Book b:al) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+""+b.quantity);
			}

	}

}

