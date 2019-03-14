import java.util.*;
public class Ch04_PrExercise19 {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		String status1;
		String status2 = "";
		double standardExemption = 0.0;
		
		System.out.print("Enter the tax filing status: "); 
		status1 = console.next();
		System.out.println();
		if (status1.equals("married") == true) {
			System.out.print("Enter filing joint/separately: "); 
			status2 = console.next();
			System.out.println();
			if (status2.equals("joint") == true) 
				standardExemption = 12000.00;
			else if (status2.equals("separately") == true) 
				standardExemption = 6000.00;
			else
				System.out.println("Invalid status.");
		} 	
		else if (status1.equals("single") == true) 
			standardExemption = 9000.00;
		else if (status1.equals("headHouseHold") == true) 
			standardExemption = 10000.00;
		else
			System.out.println("Invalid status.");
		System.out.println("Filing status: " + status1 
				+ " " + status2);
		System.out.printf("Standard exemption: $%.2f %n",
	                  standardExemption);
	}
}
