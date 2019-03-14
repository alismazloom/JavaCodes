import java.util.*;
import java.io.*;

public class Ch03_PrExercise05 {
	public static void main(String[] args) throws 
											FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("sales.txt"));
		
		double boxCost, boxAmount;
		double sidelineCost, sidelineAmount;
		double premiumCost, premiumAmount;
		double generalCost, generalAmount;
		double totalTickets, totalSaleAmount;
		
		boxCost = inFile.nextInt();
		boxAmount = inFile.nextInt();
		sidelineCost = inFile.nextInt();
		sidelineAmount = inFile.nextInt();
		premiumCost = inFile.nextInt();
		premiumAmount = inFile.nextInt();
		generalCost = inFile.nextInt();
		generalAmount = inFile.nextInt();
		
		totalTickets = boxAmount + sidelineAmount 
				+ premiumAmount + generalAmount;
		totalSaleAmount = 
				boxCost * boxAmount 
			  + sidelineCost * sidelineAmount
			  + premiumCost * premiumAmount
			  + generalCost + generalAmount;
									 
		System.out.printf("%nNumber of tickets sold: %.2f "
		+ "%nTotal sale amount $%.2f", totalTickets, totalSaleAmount);
		
		inFile.close();
	}

}
