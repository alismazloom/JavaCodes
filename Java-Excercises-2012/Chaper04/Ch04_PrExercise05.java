import java.util.*;
public class Ch04_PrExercise05 {
	
	static Scanner console = new Scanner(System.in);
	final static double serviceCharge = 3.00;
	final static double firstTenPageRate = 0.20;
	final static double extraPageRate = 0.10;
		
	public static void main(String[] args) {
		
		int pages;
		double dueAmount = 0;
		
		System.out.print("Enter the number of faxed pages: ");
		pages = console.nextInt();
		
		if (pages > 0 && pages <= 10)
			dueAmount = serviceCharge +
						pages * firstTenPageRate;
		else if (pages > 10)
		  dueAmount =  serviceCharge +
			10 * firstTenPageRate + (pages - 10) * extraPageRate;
		else
			System.out.println("Enter a positive number.");
		
		System.out.printf("Amount Due: $%.2f", dueAmount);
				
	}
}
