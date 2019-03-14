import java.util.*;

public class Exercise2_8 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] arg)
	{
		double num1, num2, num3, num4, num5;
		double sum;
		int roundedSum;
		
		System.out.print("Enter five decimal numbers: ");
		num1 = console.nextDouble();
		num2 = console.nextDouble();
		num3 = console.nextDouble();
		num4 = console.nextDouble();
		num5 = console.nextDouble();
		
		sum = num1 + num2 + num3 + num4 + num5;
		roundedSum = (int)(sum + 0.5);
		System.out.println("Sum = " + roundedSum);
		System.out.println();
	}
}
