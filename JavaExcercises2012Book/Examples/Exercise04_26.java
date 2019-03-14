import java.util.*;
public class Exercise04_26 {
	
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
	
		double firstNum, secondNum;
	
		System.out.print("Enter two nonzero numbers: "); 
		firstNum = console.nextDouble();
		secondNum = console.nextDouble(); 
		System.out.println();
	
		if (firstNum == 0)
		{
			System.out.println("Enter a nonzero number");
			firstNum = console.nextDouble();
		}
		else if (secondNum == 0)
		{
			System.out.println("Enter a nonzero number");
			secondNum = console.nextDouble();	
		}
		if (firstNum > secondNum)
			System.out.printf("first No / second No = %.2f", 
					 firstNum / secondNum);
		else if (firstNum < secondNum)
			System.out.printf("second No / first No = %.2f", 
					  secondNum / firstNum);
		else
			System.out.printf("product of the numbers = %.2f",
					 (firstNum * secondNum));
	}
} 
