
import java.util.*;
	public class Example34
	{
		static Scanner console = new Scanner(System.in);
		static final double X = 13.45;
		static final int Y = 34;
		static final char BLANK = ' ';
		public static void main(String[] arg)
		{
			String firstName, lastName;
			
			int num;
			double salary;
			
			System.out.print("Enter first name: ");
			firstName = console.next();
			System.out.println();
			
			System.out.print("Enter your last name: ");
			lastName = console.next();
			System.out.println();	
			
			System.out.print("Enter a positive integer less than 70: ");
			num = console.nextInt();
			System.out.println();
			
			salary = num * X;
			
			System.out.println("Name: " + firstName + BLANK + lastName);
			System.out.println("Wages: $" + salary);
			System.out.println("X = " + X);
			System.out.println("X + Y = " + (X + Y));
		}
	}
