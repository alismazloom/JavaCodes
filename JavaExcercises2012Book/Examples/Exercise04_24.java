import java.util.*;
public class Exercise04_24 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int a, b, c = 0;
		boolean found;
		
		System.out.print("Enter the first integer: "); 
		a = console.nextInt();
		System.out.println();
		System.out.print("Enter the second integer: "); 
		b = console.nextInt();
		
		if ((a > a * b) && (10 < b)) 
			found = 2 * a > b;
		else
		{
			found = 2 * a < b;
			if (found)
			{
				a = 3;
				c = 15;
			}
			
			if (b == c)
			{	
				b = 0;
				a = 1;
			}
	
		}
		System.out.println("a = " + a +"\nb = " + b 
				+ "\nc = " + c + "\nfound = " + found);
	}
}
