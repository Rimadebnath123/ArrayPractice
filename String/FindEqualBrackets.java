package String;
//Find an equal point in a string of brackets,This method is designed to count the number of closing parentheses in the string s. It returns an integer.
//Time Complexity: O(N), Where N is the size of the given string,Auxiliary Space: O(1)
public class FindEqualBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="(()))(()()())))";
		
		System.out.println(findIndex(s));

	}
	public static int findIndex(String s) {
		int n=s.length();
		int count=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)==')') {
				count++;
			}
		}
		return count;
	}

}
