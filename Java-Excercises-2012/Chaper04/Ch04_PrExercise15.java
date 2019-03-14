import java.util.*;
public class Ch04_PrExercise15 {
	static Scanner console = new Scanner(System.in);
	static final double REGULAR_CHARGES_PER_MINUTE = 0.20;
	static final double PREMIUM_DAYTIME_CHARGES_PER_MINUTE = 0.10;
	static final double PREMIUM_NIGHTTIME_CHARGES_PER_MINUTE = 0.05;
	
	public static void main(String[] args) {
		char serviceCode = '0';
		String serviceType = "null";
		double amountDue = 0;
		int premiumDaytimeUsage = 0;
		int premiumNighttimeUsage = 0;
		int regularUsage = 0;
		int accountNumber = 0;
		
		System.out.print("Enter your account number: ");
		accountNumber = console.nextInt();
		
		System.out.print("Enter your service type: ");  
		System.out.printf("%n'p' or 'P' for premium"
				+ "service%n'r' or 'R' for regular service: ");
		serviceCode = console.next().charAt(0);
		if (serviceCode == 'p' || serviceCode == 'P')
		{
			serviceType = "PREMIUM";
			amountDue = 25;
			System.out.printf("%nEnter the number of minutes"
					+ "%nthe system was used during the day"
					+ "%n(from 6:00 a.m. to 6:00 p.m.): ");
			premiumDaytimeUsage = console.nextInt();
			
			if (premiumDaytimeUsage < 0)
				System.out.printf("%nEnter a positive number.");
			else if (premiumDaytimeUsage > 75)
				amountDue += (premiumDaytimeUsage - 75) * 
							PREMIUM_DAYTIME_CHARGES_PER_MINUTE;
			
			System.out.printf("%nEnter the number of minutes"
					+ "%nthe system was used during the night"
					+ "%n(from 6:00 p.m. to 6:00 a.m.): ");
			premiumNighttimeUsage = console.nextInt();
			if (premiumNighttimeUsage < 0)
				System.out.printf("%nEnter a positive number.");
			else if (premiumNighttimeUsage > 100)
				amountDue += (premiumNighttimeUsage - 100) * 
						PREMIUM_NIGHTTIME_CHARGES_PER_MINUTE;			
		}
		else if (serviceCode == 'r' || serviceCode == 'R')
		{
			serviceType = "REGULAR";
			amountDue = 10;
			
			System.out.printf("%nEnter the number of minutes"
					+ "%nthe system was used: ");
			regularUsage = console.nextInt();
			if (regularUsage > 50)
				amountDue += (regularUsage - 50) * 
							REGULAR_CHARGES_PER_MINUTE;
		}
		else
			System.out.printf("%nYour service type input was invalid."); 
		
		System.out.printf("%nAccount Number: %d",accountNumber);
		System.out.printf("%nType of service: %s", serviceType);
		System.out.printf("%nNumber of minutes the telephone "
				+ "was used: %d", (regularUsage + 
				premiumDaytimeUsage + premiumNighttimeUsage));
		System.out.printf("%nAmount Due: %.2f", amountDue);		
	}
}
