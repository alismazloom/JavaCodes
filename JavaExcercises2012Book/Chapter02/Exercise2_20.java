import java.util.*;

public class Exercise2_20 {
	
	static Scanner console = new Scanner(System.in);	
	static final double SERVICE_CHARGE = 1.5 / 100;	
	
	public static void main(String[] arg) {
		
		int noOfSoldShares;
		double purchasePrice, sellingPrice;
		double investedAmount, totalServiceCharges;
		double lossGainAmount, rcvdAmount;
		
		System.out.print("Input the number of shares sold: ");
		noOfSoldShares = console.nextInt();
		System.out.print("Input the purchase price of each share: ");
		purchasePrice = console.nextInt();
		System.out.print("Input the selling price of each share: ");
		sellingPrice = console.nextInt();
		
		investedAmount = purchasePrice * noOfSoldShares;
		totalServiceCharges = 2 * SERVICE_CHARGE * investedAmount;
		lossGainAmount = (sellingPrice - purchasePrice) * noOfSoldShares;
		rcvdAmount = sellingPrice * noOfSoldShares - totalServiceCharges;
		
		System.out.println("The amount invested: $" 
							+ investedAmount);
		System.out.println("The total service charges: $" 
							+ totalServiceCharges);
		System.out.println("The amount gained/lost: $"
							+ lossGainAmount);
		System.out.println("The amount received after selling: $"
							+ rcvdAmount);
		
	}

}
