import java.util.*;

public class Exercise2_14 {
	
	static Scanner console = new Scanner(System.in);
	final static double MILK_CARTOON_CAPACITY = 3.78;
	final static double PRODUCTION_COST_PER_LITER = 0.38;
	final static double PROFIT_PER_CARTOON = 0.27;
	
	public static void main(String[] arg) {
		
		double producedAmount;
		int noOfCartoons;
		double totalCost;
		double totalProfit;
		
		System.out.print("Input the quantity of produced milk in liters: ");
		producedAmount = console.nextDouble();
		
		noOfCartoons = (int)(0.5 + producedAmount / MILK_CARTOON_CAPACITY);
		totalCost = producedAmount * PRODUCTION_COST_PER_LITER;
		totalProfit = noOfCartoons * PROFIT_PER_CARTOON;
		
		System.out.println("Number of needed cartoons: " + noOfCartoons);
		System.out.println("Cost of production: $" + totalCost);
		System.out.println("Profit of production: $" + totalProfit);
	}
}
