import java.io.*;
import java.util.*;
import javax.swing.*;

public class Ch03_PrExercise06 {
	public static void main(String[] args) throws
											FileNotFoundException{
		
		Scanner inFile = new Scanner(new FileReader("deduction.txt"));
		PrintWriter outFile = new PrintWriter("salary.dat");
		
		double federalIncomeTax, stateTax;
		double socialSecurityTax, medicareTax;
		double pensionPlan, healthInsurance;
		double grossIncome, netPay;
		String name, str;
		
		name = JOptionPane.showInputDialog("Enter your full name: ");
		outFile.println(name);
		
		str = JOptionPane.showInputDialog("Enter your gross income: ");
		grossIncome = Double.parseDouble(str);
		
		str = "Gross Amount: ";
		outFile.printf("%-23s$ %7.2f%n", str, grossIncome);
		
		federalIncomeTax = grossIncome * inFile.nextDouble() / 100;
		str = "Federal Tax:";
		outFile.printf("%-23s$ %7.2f%n", str, federalIncomeTax);
		
		stateTax = grossIncome * inFile.nextDouble() / 100;
		str = "State Tax:";
		outFile.printf("%-23s$ %7.2f%n", str, stateTax);
		
		socialSecurityTax = grossIncome * inFile.nextDouble() / 100;
		str = ("Social Security Tax:");
		outFile.printf("%-23s$ %7.2f%n", str, socialSecurityTax);
		
		medicareTax = grossIncome * inFile.nextDouble() / 100;
		str = ("Medicare/Medicaid Tax:");
		outFile.printf("%-23s$ %7.2f%n", str, medicareTax);
		
		pensionPlan = grossIncome * inFile.nextDouble() / 100;
		str = ("Pension Plan:");
		outFile.printf("%-23s$ %7.2f%n", str, pensionPlan);
		
		healthInsurance = inFile.nextDouble();
		str = ("Health Insurance:");
		outFile.printf("%-23s$ %7.2f%n", str, healthInsurance);
		
		netPay = grossIncome - 
				(federalIncomeTax + stateTax + socialSecurityTax
				+ medicareTax + pensionPlan + healthInsurance);
		str = ("Net Pay:");
		outFile.printf("%-23s$ %7.2f%n", str, netPay); 
		
		inFile.close();
		outFile.close();
		
	}
}
