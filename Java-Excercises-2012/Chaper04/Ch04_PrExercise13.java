
import java.util.*;
public class Ch04_PrExercise13 {
	static Scanner console = new Scanner(System.in);
	static final double LOW_SALE_COMMISSION_RATE = 3;
	static final double HIGH_SALE_COMMISSION_RATE = 6;
	
	public static void main(String[] args) {
		
		int noOfServiceYears;
		double baseSalary, totalSales;
		double bonus, additionalBonus;
		double payCheck;
		
		System.out.printf("Enter the base salary: ");
		baseSalary = console.nextDouble();
		System.out.printf("%nEnter the number of service years: ");
		noOfServiceYears = console.nextInt();
		if (noOfServiceYears <= 5)
			bonus = 10 * noOfServiceYears;
		else
			bonus = 20 * noOfServiceYears;
		
		System.out.printf("%nEnter the value of total sales: ");
		totalSales = console.nextDouble();
		if (totalSales < 5000)
			additionalBonus = 0;
		else if (totalSales >= 5000 && totalSales < 10000)
			additionalBonus = totalSales * LOW_SALE_COMMISSION_RATE / 100;
		else
			additionalBonus = totalSales * HIGH_SALE_COMMISSION_RATE / 100;
		
		payCheck = baseSalary + bonus + additionalBonus;
		System.out.printf("Paycheck amount: %.2f", payCheck);
	}

}
