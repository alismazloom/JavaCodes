
import java.util.*;

public class Exercise2_4 
{
	static Scanner console = new Scanner(System.in);
	
	final static int SECRET = 11;
	final static double RATE = 12.5;
	 
	public static void main(String[] arg)
	{
		 int num1, num2, newNum;
		 double hoursWorked, wages;
		 String name;
		 
		 System.out.print("Enter two integers: ");
		 num1 = console.nextInt();
		 num2 = console.nextInt();
		 System.out.println();
		 System.out.println("The value of num1 = " + num1
				 			+ "\nThe value of num2 = " + num2);

		 newNum = 2 * num1 + num2;
		 System.out.println("\nnewNum = " + newNum);
		 newNum += SECRET;
		 System.out.println("\nnewNum = " + newNum);
		 
		 System.out.print("Enter your last name: ");
		 name = console.next();
		 
		 System.out.print("Enter a decimal number between 0 and 70: ");
		 hoursWorked = console.nextDouble();
		 wages = hoursWorked * RATE;
		 
		 System.out.println("Name: " + name);
		 System.out.println("Pay Rate: $" + RATE);
		 System.out.println("Hours Worked: " + hoursWorked);
		 System.out.println("Salary: $" + wages);
	}

}
