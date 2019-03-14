import java.util.*;
public class Ch04_PrExercise01 {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int number;
		
		System.out.print("Enter a number: ");
		number = console.nextInt();
		
		if (number > 0)
			System.out.printf("%d is a positive number. ", number);
		else if (number < 0)
			System.out.printf("%d is a negative number.", number);
		else
			System.out.printf("Number is zero.");
	}

}
