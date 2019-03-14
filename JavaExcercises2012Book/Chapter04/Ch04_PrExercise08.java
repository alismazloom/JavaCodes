import java.util.*;
public class Ch04_PrExercise08 {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double a, b, c;
		double discriminant;
		
		System.out.print("Enter the coefficients of "
				+ "your quadratic equation: ");
		a = console.nextDouble();
		if (a == 0)
		{
			System.out.println("Enter a non-zero number as "
					+ "the first coefficient: ");
			a = console.nextDouble();
		}				
		b = console.nextDouble();
		c = console.nextDouble();
		discriminant = b * b - 4 * a * c;

		if (discriminant < 0)
			System.out.print("This equation has two complex roots.");
		else if (discriminant == 0) 
		{
			System.out.print("This equation has repeated roots.");
			System.out.printf("%nX = %.4f", -b / (2 * a));
		}
		else 
		{
			System.out.print("This equation has two real roots.");
			
			System.out.printf("%nX1 = %.4f", 
			(-b + Math.sqrt(discriminant)) / (2 * a));
			
			System.out.printf("%nX2 = %.4f", 
			(-b - Math.sqrt(discriminant)) / (2 * a));
		}	
	}
}
