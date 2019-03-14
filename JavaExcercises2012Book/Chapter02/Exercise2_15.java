import java.util.Scanner;

public class Exercise2_15 {
	
	static Scanner console = new Scanner(System.in);
	final static double MILK_CARTOON_CAPACITY = 3.78;
	public static void main(String[] arg) {
		
		double costPerLiter;
		double profitPerCartoon;
		double producedAmount;
		int noOfCartoons;
		double totalCost;
		double totalProfit;
		
		System.out.print("Input the quantity of produced milk in liters: ");
		producedAmount = console.nextDouble();
		System.out.print("Input the cost of producing one liter of milk: ");
		costPerLiter = console.nextDouble();
		System.out.print("Input the profit for producing each cartoon: ");
		profitPerCartoon = console.nextDouble();
		
		noOfCartoons = (int)(0.5 + producedAmount / MILK_CARTOON_CAPACITY);
		totalCost = producedAmount * costPerLiter;
		totalProfit = noOfCartoons * profitPerCartoon;
		
		System.out.println("Number of needed cartoons: " + noOfCartoons);
		System.out.println("Cost of production: $" + totalCost);
		System.out.println("Profit of production: $" + totalProfit);
	}
}