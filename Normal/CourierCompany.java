package Normal;

import java.util.Scanner;

public class CourierCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter weight of parcel: ");
	        double wt = sc.nextDouble();
	        
	        System.out.print("Enter type of booking: ");
	        char type = sc.next().charAt(0);
	        
	        sc.close();
	        double charge = 0;
	        
	        if (wt <= 0)
	            charge = 0;
	        else if (wt <= 100 && type == 'O')
	            charge = 80.5;
	        else if (wt <= 100 && type == 'E')
	            charge = 100.7;
	        else if (wt <= 500 && type == 'O')
	            charge = 150.5;
	        else if (wt <= 500 && type == 'E')
	            charge = 200.5;
	        else if (wt <= 1000 && type == 'O')
	            charge = 210;
	        else if (wt <= 1000 && type == 'E')
	            charge = 250.5;
	        else if (wt > 1000 && type == 'O')
	            charge = 250;
	        else if (wt > 1000 && type == 'E')
	            charge = 300.5;
	            
	        System.out.println("Parcel charges = " + charge);
	    }

}
