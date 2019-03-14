
import java.util.*;

public class Exercise2_5 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int length;
		int width;
		int area;
		int perimeter;
	
		System.out.print("Enter the length: "); 
		length = console.nextInt();
		System.out.println();

		System.out.print("Enter the width: "); 
		width = console.nextInt(); 
		System.out.println();
		
		area = length * width;
		System.out.println("Area = " + area); 
		
		perimeter = 2 * (length + width);
		System.out.println("Perimeter = " + perimeter); 
	}
}