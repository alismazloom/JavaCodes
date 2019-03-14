import java.util.*;

public class first 
{
	static Scanner console = new Scanner(System.in); 
	
	public static void main(String[] arg)
	{
		int num1, num2;
		System.out.print("Enter two integer numbers: ");
		
		num1 = console.nextInt(); 
		num2 = console.nextInt();
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2 
					      + "\n2num1 - num2 = " + (2 * num1 - num2));
		System.out.println(num1 + " " + num2 + " " + num1 * num2 );
		
		int a, b, sum;
		double c;
		a = 3;
		b = 5;
		c = 14.1;
		sum = 0;
		sum = a + b +(int) c; 
		System.out.println("a = " + a + " b = " + b + " c = " + c
							+ " sum = " + sum);
		c /= a;
		System.out.println("a = " + a + " b = " + b + " c = " + c
				+ " sum = " + sum);
		b +=(int) c - a;
		System.out.println("a = " + a + " b = " + b + " c = " + c
				+ " sum = " + sum);
		a *= 2 * b +(int) c;
		System.out.println("a = " + a + " b = " + b + " c = " + c
				+ " sum = " + sum);

	}
}