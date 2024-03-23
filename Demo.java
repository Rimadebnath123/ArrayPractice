import javax.swing.JOptionPane;

public class Demo {

	static boolean checkJob(String knowledge) {
		if(knowledge.equalsIgnoreCase("Spring"))
			return true;
		else if(knowledge.equalsIgnoreCase("SQL"))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean statusOfJob=checkJob(JOptionPane.showInputDialog("enter knowledge"));
		//if(statusOfJob)
		if(checkJob(JOptionPane.showInputDialog("enter knowledge")))
			System.out.println("eligible for job");
		else
			System.out.println("sorry");
	}

}
