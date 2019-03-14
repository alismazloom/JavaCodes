import java.util.*;
public class Ch04_PrExercise02 {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int num1, num2, num3;
		
		System.out.print("Enter three numbers: ");
		num1 = console.nextInt();
		num2 = console.nextInt();
		num3 = console.nextInt();
		System.out.println("Numbers in nondescending order: ");
		
		if (num1 <= num2 && num1 <= num3)
		{
			System.out.println(num1);
			if (num2 <= num3)
			{
				System.out.println(num2);
				System.out.println(num3);
			}
			else
			{
				System.out.println(num3);
				System.out.println(num2);
			}
		}
		
		else if (num2 <= num1 && num2 <= num3)
		{
			System.out.println(num2);
			if (num1 <= num3)
			{
				System.out.println(num1);
				System.out.println(num3);
			}
			else
			{
				System.out.println(num3);
				System.out.println(num1);
			}

		}
		
		else if (num3 <= num1 && num3 <= num2)
		{
			System.out.println(num3);
			if (num1 <= num2)
			{
				System.out.println(num1);
				System.out.println(num2);
			}
			else
			{
				System.out.println(num2);
				System.out.println(num1);
			}
		}
	}
}
