import java.util.*;
public class Ch04_PrExercise09 {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1, num2;
		char ch;
		
		System.out.print("Enter two integers and one"
		+ " arithmetic operation (example 3 + 4) : ");
		
		num1 = console.nextInt();
		ch = console.next().charAt(0);
		num2 = console.nextInt();
		
		switch(ch) {
		
		case '+':
			System.out.printf("%n%d + %d = %d",num1 ,num2 , num1 + num2);
			break;
			
		case '-':
			System.out.printf("%n%d - %d = %d",num1 ,num2 , num1 - num2);
			break;
			
		case '*':
			System.out.printf("%n%d * %d = %d",num1 ,num2 , num1 * num2);
			break;
			
		case '/':
			System.out.printf("%n%d / %d = %d",num1 ,num2 , num1 / num2);
			break;
			
		default:
			System.out.println("The operator is not valid.");			
		}
	}
}