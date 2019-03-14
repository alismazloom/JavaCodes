import java.util.*;

public class Exercise2_10 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] arg)
	{
		double capacity, mpg, totalMiles;
		
		System.out.print("Enter fueltank capacity in gallons: ");
		capacity = console.nextDouble();
		System.out.print("Enter miles per gallon: ");
		mpg = console.nextDouble();
		
		totalMiles = capacity * mpg;
		System.out.println("Total miles the car can travel with full fueltank: " 
							+ totalMiles);
	}

}
