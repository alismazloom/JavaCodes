import java.util.*;
import java.io.*;

public class Exercise3_20 {
	public static void main(String[] args) 
								throws FileNotFoundException {
		
	
		Scanner inFile = new Scanner(new FileReader("Ex20Input.txt"));
		PrintWriter outFile = new PrintWriter("Ex20Output.dat");
		
		int num1, num2;
		
		num1 = inFile.nextInt();
		num2 = inFile.nextInt();
		inFile.close();
		
		outFile.println("Sum = " + (num1 + num2));
		outFile.close();
		
		//Exercise3_23
		int acctNumber = inFile.nextInt();
		String accountType = inFile.next();
		double balance = inFile.nextDouble();

	}
}
