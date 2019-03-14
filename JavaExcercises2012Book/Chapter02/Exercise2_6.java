import java.util.*;

public class Exercise2_6 
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double originalNumber;
		int roundedNumber;
		
		System.out.print("Enter a decimal number: ");
		originalNumber = console.nextDouble();
		System.out.println();
		
		roundedNumber = (int)(originalNumber + 0.5);
		System.out.println("Rounded to nearest integer: " 
							+ roundedNumber);
	}

}
