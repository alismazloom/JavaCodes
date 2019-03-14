import java.util.*;
public class Exercise05_02 {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double num1, num2;
		char ch;
		
		System.out.printf("Enter two decimal numbers and one"
		+ " arithmetic operation%n(example: 3 + 4) ");
		
		num1 = console.nextDouble();
		ch = console.next().charAt(0);
		num2 = console.nextDouble();
		
		switch(ch) {
		
		case '+':
			System.out.printf("%n%.2f + %.2f = %.2f",
					num1 ,num2 , num1 + num2);
			break;
			
		case '-':
			System.out.printf("%n%.2f - %.2f = %.2f",
					num1 ,num2 , num1 - num2);
			break;
			
		case '*':
			System.out.printf("%n%.2f * %.2f = %.2f",
					num1 ,num2 , num1 * num2);
			break;
			
		case '/':
			System.out.printf("%n%.2f / %.2f = %.2f",
					num1 ,num2 , num1 / num2);
			break;
			
		default:
			System.out.println("The operator is not valid.");			
		}
	}
}