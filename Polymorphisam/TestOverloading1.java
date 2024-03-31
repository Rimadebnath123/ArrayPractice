package Polymorphisam;

//changing the datatypes

class Adder1{ 
	
static int add(int a, int b)
{
	return a+b;
	}  
static double add(double a, double b)
{
	return a+b;
	}  
}  
public class TestOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder1.add(11,11));  
		System.out.println(Adder1.add(12.3,12.6));  
	}

}
