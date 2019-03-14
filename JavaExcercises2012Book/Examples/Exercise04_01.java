import java.util.*;
public class Exercise04_01 {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{	
		
		int num;
		int x,y,z;
		
		System.out.print("Input an integer: ");
		num = console.nextInt(); 
		if (num > 5)	
		{		
			System.out.println(num);
			num = 0;
		}
		else
			System.out.println("Num is zero");
		
		x = 100;
		y = 200;
		z = 0;
		if (x > 100 && y <= 200)
		System.out.println(x + " " + y + " " + (x + y));
		else
		System.out.println(x + " " + y + " " + (2 * x - y));
		
		int myNum = 30; 
		int yourNum = 33;
		if (yourNum % myNum == 3)
		{
			yourNum = 3;
			myNum = 1;
		}
		else if (yourNum % myNum == 2) 
		{
			yourNum = 2;
			myNum = 2;
		}
		else
		{
			yourNum = 1;
			myNum = 3;
		}
		System.out.println(myNum + " " + yourNum);
		if (x == 70) 
			System.out.println("Grade is C.");
			
		z = (x >= y) ? x - y : y - x;
		System.out.println(z);
		
		y = (x < 5) ? 10 : 20;
		x = 25;
		switch (x % 6) {
		case 1: 
		case 2:
		case 3: 
		case 4: 
		case 5:
			System.out.println(x); 
			break;
			
			case 0: 
				System.out.println(); 
				break;
		}
		int alpha = 5;
		switch (alpha) {
		case 1:
		case 2:
			alpha = alpha + 2; 
			break;
			
		case 4: 
			alpha++;
			
		case 5:
			alpha = 2 * alpha;
			
		case 6:
			alpha = alpha + 5; 
			break;
		default :
			alpha--;
		} 
		int beta = 3;
		
		switch (beta) {
		case 3:
		beta = beta + 3; 
		case 1:
		beta++; 
		break;
		case 5:
		beta = beta + 5;
		case 4:
		beta = beta + 4;
		}
			
		int a = 6;
		if (a > 0) 
			switch (a)
			{
			case 1:
				a = a + 3;
			case 3: a++;
				break;
				
			case 6:
				a = a + 6;
			case 8:
				a = a * 8;
				break;
				
			default: 
				a--;
			}
		else
			a = a + 2;
		System.out.println("a = " + a);
		}
}
