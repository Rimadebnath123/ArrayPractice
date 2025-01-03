package String;
//Check if a string can be obtained by rotating another string 2 places/t-o(n),s-o(n)
public class StringRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRotate s=new StringRotate();
		String str1="amazon";
		String str2="azonam";
		System.out.println(s.findRotation(str1,str2));
		
		 str1 = "amazon";
	        str2 = "onamaz";
	        System.out.println(s.findRotation(str1, str2));
	}
	public  boolean findRotation(String str1,String str2) {
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		if(str1.length()<=2 ||str2.length()<=2) {
			return str1.equals(str2);
		}
		
		String anti="";
		String clock="";
		int len=str2.length();
		
		anti=str2.substring(len-2)+str2.substring(0,len-2);
		clock=str2.substring(2)+str2.substring(0,2);
		
		return str1.equals(clock)|| str1.equals(anti);
		}

}
//1st
//anti=str2.substring(len-2) = "am"
//anti=str2.substring(0,len-2) = "azon"

//clock=str2.substring(2) = "onam"
//clock=str2.substring(0, 2) = "az"