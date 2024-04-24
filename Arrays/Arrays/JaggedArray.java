package Arrays;
//Java Program to illustrate the jagged array  
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][];
		
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		
		  //initializing a jagged array by this 
        int count = 2;  
        for (int i=0; i<arr.length; i++)  
            for(int j=0; j<arr[i].length; j++)  
                arr[i][j] = count++;  
   
        //printing the data of a jagged array   
        for (int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  
	}

}
