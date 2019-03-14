import java.util.Scanner;

public class Exercise2_9 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] arg)
	{
		double num1, num2, num3, num4, num5;
		double sum, average;
		
		System.out.print("Enter five decimal numbers: ");
		num1 = console.nextDouble();
		num2 = console.nextDouble();
		num3 = console.nextDouble();
		num4 = console.nextDouble();
		num5 = console.nextDouble();
		
		System.out.println("num1 = " + num1 + " num2 = " + num2 
							+ " num3 = " + num3 + " num4 = " 
							+ num4 + " num5 = " + num5);
		
		num1 = (int)(num1 + 0.5);
		num2 = (int)(num2 + 0.5);
		num3 = (int)(num3 + 0.5);
		num4 = (int)(num4 + 0.5);
		num5 = (int)(num5 + 0.5);
		
		sum = num1 + num2 + num3 + num4 + num5;
		average = sum / 5;
		
		System.out.println("Sum = " + sum + "\nAverage = " + average);
		System.out.println();
	}
}