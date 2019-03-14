import java.util.*;
public class Ch04_PrExercise06 {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		double a, b, c;
		
		System.out.print("Enter the lengths of three sides "
				+ "of the triangle: ");
		a = console.nextDouble();
		b = console.nextDouble();
		c = console.nextDouble();
		
		if ((a * a == b * b + c * c) ||
		   (b * b == a * a + c * c) ||
		   (c * c == a * a + b * b)) 
			
			System.out.print("This is a right triangle.");
		else
			System.out.print("This is NOT a right triangle.");
			
	}

}
