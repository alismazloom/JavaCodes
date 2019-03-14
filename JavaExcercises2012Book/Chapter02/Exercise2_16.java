import java.util.*;

public class Exercise2_16 {
	
	static Scanner console = new Scanner(System.in);
	
	static final int NO_OF_WEEKS = 5;
	static final double TAX_RATE = 0.14;
	static final double CLOTH_ACCESSORY_EXPENSE_RATE = 0.10;
	static final double SCHOOL_SUPPLIES_RATE = 0.01;
	static final double BOND_INV_PERC_BY_YOU = 0.25;
	static final double BOND_INV_PERC_BY_PARENTS = 0.50;
	
	public static void main(String[] arg) {
		
		int workedHours;
		double payRatePerHour;
		double grossIncome, netIncome;
		double clothsAccessoryExpense;
		double schoolSupplies;
		double invBondsByYou;
		double invBondsByParents;
	
		System.out.print("Input number of hours you worked each week: ");
		workedHours = console.nextInt();
		System.out.print("Input the pay rate for an hour: ");
		payRatePerHour = console.nextDouble();
			
		grossIncome = NO_OF_WEEKS * workedHours * payRatePerHour;
		netIncome = grossIncome * (1 - TAX_RATE);
		System.out.println("Income before tax = $" + grossIncome);
		System.out.println("Income after tax = $" + netIncome);
		
		clothsAccessoryExpense = netIncome * CLOTH_ACCESSORY_EXPENSE_RATE;
		schoolSupplies = netIncome * SCHOOL_SUPPLIES_RATE;
		System.out.println("The money you spend on clothes and "
				+ "other accessories = $" + clothsAccessoryExpense);
		System.out.println("The money you spend on school supplies "
				+ "= $" + schoolSupplies);
	
		invBondsByYou = (netIncome - clothsAccessoryExpense 
						- schoolSupplies) * BOND_INV_PERC_BY_YOU;
		invBondsByParents = invBondsByYou * BOND_INV_PERC_BY_PARENTS;
		System.out.println("The money you spend to buy savings bonds"
				+ " = $" + invBondsByYou);
		System.out.println("The money your parents spend to buy "
				+ "additional savings bonds for you = $" + invBondsByParents);
	}
	
}
