import java.util.*;

public class Exercise2_19 {
	
	static Scanner console = new Scanner(System.in);
	static final double POUND_PER_METRIC_TON = 2204.623;
	
	public static void main(String[] args) {
		
		double riceAmount;
		int noOfBags;
		
		System.out.print("Input the amount of rice, "
						+ "in pounds, in a bag: ");
		riceAmount = console.nextDouble();
		
		noOfBags = (int)(0.5 +  POUND_PER_METRIC_TON / riceAmount);
		System.out.println("Number of bags needed to store "
						+ "one metric ton of rice: " + noOfBags);
	}
}
