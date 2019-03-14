
import java.util.*;
public class Ch04_PrExercise11 {
	static Scanner console = new Scanner(System.in);
	
	public final double SAVINGS_BONDS_RATE = 1;
	static final int NO_OF_WEEKS = 5;
	static final double TAX_RATE = 0.14;
	static final double CLOTH_ACCESSORY_EXPENSE_RATE = 0.10;
	static final double SCHOOL_SUPPLIES_RATE = 0.01;
	static final double BOND_INV_PERC_BY_PARENTS_SC1 = 1;
	static final double BOND_INV_PERC_BY_PARENTS_SC2 = 25;
	static final double BOND_INV_PERC_BY_PARENTS_SC3 = 40;
	
	public static void main(String[] arg) {
		
		int workedHours;
		double payRatePerHour;
		double grossIncome, netIncome;
		double clothsAccessoryExpense;
		double schoolSupplies;
		double savedMoney;
		double invBondsPercByYou;
		double invBondsByYou;
		double invBondsByParents = 0;
	
		System.out.print("Input the number of hours you worked each week: ");
		workedHours = console.nextInt();
		System.out.print("Input the pay rate for an hour: ");
		payRatePerHour = console.nextDouble();
		
		System.out.printf("Input the percentage of your income "
				+ "%nworth of savings bonds you want to invest in:");
		invBondsPercByYou = console.nextDouble();
	
		if (invBondsPercByYou < 0)
		{
			System.out.print("Invalid percentage.");
			System.out.printf("%nInput the percentage of your income "
					+ "%nworth of savings bonds you want to invest in:");
			invBondsPercByYou = console.nextDouble();
		}
		
		grossIncome = NO_OF_WEEKS * workedHours * payRatePerHour;
		netIncome = grossIncome * (1 - TAX_RATE);
		invBondsByYou = netIncome * invBondsPercByYou / 100;
		
		System.out.printf("%nIncome before tax = $%.2f", grossIncome);
		System.out.printf("%nIncome after tax = $%.2f", netIncome);
		
		clothsAccessoryExpense = netIncome * CLOTH_ACCESSORY_EXPENSE_RATE;
		schoolSupplies = netIncome * SCHOOL_SUPPLIES_RATE;
		System.out.printf("%nThe money you spend on clothes and "
				+ "other accessories = $%.2f", clothsAccessoryExpense);
		System.out.printf("%nThe money you spend on school supplies "
				+ "= $%.2f", schoolSupplies);
		savedMoney = netIncome - clothsAccessoryExpense 
				- schoolSupplies;
		
		if(invBondsPercByYou == 0)		
			invBondsByParents = 
					savedMoney * BOND_INV_PERC_BY_PARENTS_SC1 / 100;	
		
		else if(invBondsPercByYou <= 25)
			invBondsByParents = 
					invBondsByYou * BOND_INV_PERC_BY_PARENTS_SC2 / 100
					+ savedMoney * 1 / 100;
		else if(invBondsPercByYou > 25)
			invBondsByParents = 
					invBondsByYou * BOND_INV_PERC_BY_PARENTS_SC3 / 100
					+ savedMoney * 2 / 100;
		
		System.out.printf("%nThe money you spend to buy savings bonds"
				+ " = $%.2f", invBondsByYou);
		System.out.printf("%nThe money your parents spend to buy "
			+ "additional savings bonds for you = $%.2f", invBondsByParents);
		}
}	
		
