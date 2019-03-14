import java.util.*;

public class Exercise2_13 {
	
	static Scanner console = new Scanner(System.in);
	public static void main(String[] arg) {
		
		double originalPrice;
		double markedUpPercentage;
		double salesTaxRate;
		double sellingPrice;
		double salesTax;
		double finalPrice;
		
		System.out.print("Input original price of the item: ");
		originalPrice = console.nextDouble();
		System.out.print("Input percentage of marked-up price: ");
		markedUpPercentage = console.nextDouble();
		System.out.print("Input sales tax rate: ");
		salesTaxRate = console.nextDouble();
		
		sellingPrice = originalPrice * (1 + markedUpPercentage / 100);
		salesTax = sellingPrice * salesTaxRate / 100;
		finalPrice = sellingPrice + salesTax;
		
		System.out.println(" Original Price of the item is: $" + originalPrice);
		System.out.println(" Marked-up Percentage is: " + markedUpPercentage + "%");
		System.out.println(" Selling Price is: $" + sellingPrice);
		System.out.println(" Sales Tax Rate is: " + salesTaxRate + "%");
		System.out.println(" Sales Tax is: $" + salesTax);
		System.out.println(" Final Price of the item is: $" + finalPrice);
	}
}
