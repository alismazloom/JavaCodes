import java.io.*;
import java.util.*;

public class Ch03_PrExercise07 {
	public static void main(String[] args) throws
											FileNotFoundException {
		
	Scanner inFile = new Scanner(new FileReader("Ch3_Ex7Data.txt"));
	PrintWriter outFile = new PrintWriter("Ch3_Ex7Output.dat");
	
	String firstName, lastName;
	double currentSalary, updatedSalary;
	double increaseRate;
	
	lastName = inFile.next();
	firstName = inFile.next();
	currentSalary = inFile.nextDouble();
	increaseRate = inFile.nextDouble() / 100;
	updatedSalary = currentSalary * (1 + increaseRate);
	outFile.printf("%s %s %.2f%n", firstName, lastName, updatedSalary );
	
	lastName = inFile.next();
	firstName = inFile.next();
	currentSalary = inFile.nextDouble();
	increaseRate = inFile.nextDouble() / 100;
	updatedSalary = currentSalary * (1 + increaseRate);
	outFile.printf("%s %s %.2f%n", firstName, lastName, updatedSalary );
	
	lastName = inFile.next();
	firstName = inFile.next();
	currentSalary = inFile.nextDouble();
	increaseRate = inFile.nextDouble() / 100;
	updatedSalary = currentSalary * (1 + increaseRate);
	outFile.printf("%s %s %.2f%n", firstName, lastName, updatedSalary );
	
	inFile.close();
	outFile.close();
	
	}
}
