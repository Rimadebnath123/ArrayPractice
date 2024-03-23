import java.util.HashSet;
public class SameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=456,b=462,c=657;
		HashSet<Integer>A=new HashSet<>();
		HashSet<Integer>B=new HashSet<>();
		HashSet<Integer>C=new HashSet<>();
		while(a>0)
		{
			A.add(a%10);
			a/=10;
			
		}
		System.out.println(A);
		while(b>0)
		{
			B.add(b%10);
			b/=10;
		}
		while(c>0)
		{
			C.add(c%10);
			c/=10;
		}
		for (int i:A) {
			if(B.contains(i)&&C.contains(i)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}
