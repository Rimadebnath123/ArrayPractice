package Inheritence;
//single Tnheritence

class Animal{  
void eat(){System.out.println("eating...");}  
} 

class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
} 

public class TestInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
	}

}
