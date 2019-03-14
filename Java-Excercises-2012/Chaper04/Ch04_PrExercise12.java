import java.util.*;
public class Ch04_PrExercise12 {
	static Scanner console = new Scanner(System.in);
	static final double LOW_SAVINGS_SERVICE_CHARGE = 10;
	static final double LOW_CHECKING_SERVICE_CHARGE = 25;
	static final double SAVINGS_BALANCE_INTEREST_RATE = 4;
	static final double CHECKING_BALANCE_INTEREST_RATE = 3;
	static final double HIGH_CHECKING_BALANCE_INTEREST_RATE = 5;
	
	public static void main(String[] args) {
		int accountNumber;
		String accountType = "hello";
		char accountTypeEntry;
		double minBalance, newBalance; 
		double currentBalance;
		
		System.out.print("Enter customer's account number: ");
		accountNumber = console.nextInt();
		
		System.out.printf("Enter the type of your account"
		+ "%n('S' or 's' for Savings and 'c' or 'C' for Checking): ");
		accountTypeEntry = console.next().charAt(0);
		
		if (accountTypeEntry == 'c' || accountTypeEntry == 'C') 
			accountType = "CHECKINGS";
		else if (accountTypeEntry == 's' || accountTypeEntry == 'S')
			accountType = "SAVINGS";
		else 
			System.out.printf("%nThe account type you entered "
					+ "is not valid.");
		
		System.out.printf("Enter minimum balance: ");
		minBalance = console.nextDouble();
		System.out.printf("Enter the current balance: ");
		currentBalance = console.nextDouble();
		
		System.out.printf("%nAccount number: %d", accountNumber);
		System.out.printf("%nAccount type: %s", accountType);
		
		if (currentBalance < minBalance)
			if (accountType == "SAVINGS")
				newBalance = currentBalance - LOW_SAVINGS_SERVICE_CHARGE;
			else
				newBalance = 
						currentBalance - LOW_CHECKING_SERVICE_CHARGE;
		else 
			if (accountType == "SAVINGS")
				newBalance = currentBalance * 
				(1 + SAVINGS_BALANCE_INTEREST_RATE / 100);
			else if (currentBalance <= 5000)
				newBalance = currentBalance * 
				(1 + CHECKING_BALANCE_INTEREST_RATE / 100);
			else
				newBalance = currentBalance * 
				(1 + HIGH_CHECKING_BALANCE_INTEREST_RATE / 100);
	
		System.out.printf("%nCurrent balance: %.2f", currentBalance);
		System.out.printf("%nNew balance: %.2f", newBalance);
	
	}
}
