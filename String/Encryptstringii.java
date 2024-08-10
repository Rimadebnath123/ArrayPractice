package String;
//Encrypt the string – 2
public class Encryptstringii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="abc";
		String s="aaaaaaaaaaa";
		int n=s.length();
		System.out.println(encryptString(s, n));
	}
	public static String encryptString(String s,int n) {
		
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			int count=0;
			String hex;
			while(i<n && s.charAt(i)==ch) {
				count++;
				i++;
			}
			i--;
			
			hex=convertHex(count);
			ans.append(ch);
			ans.append(hex);
		}
		ans.reverse();
		return ans.toString();
		
	}
	
	public static String convertHex(int num) {
		StringBuilder temp=new StringBuilder();
		int rem;
		while(num!=0) {
			rem=num%16;
			char ch;
			if(rem<10) {
			ch=(char)(rem+48);	
			}
			else {
				ch=(char)(rem+87);		
			}
			temp.append(ch);
			num=num/16;
		}
		return temp.toString();
		
	}

}
