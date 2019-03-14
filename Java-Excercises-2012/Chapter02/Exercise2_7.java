import java.util.*;

public class Exercise2_7 
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double score1, score2, score3, score4, score5;
		double average;
		
		System.out.print("Enter five Scores: ");
		
		score1 = console.nextDouble();
		score2 = console.nextDouble();
		score3 = console.nextDouble();
		score4 = console.nextDouble();
		score5 = console.nextDouble();
		
		average = (score1 + score2 + score3 + score4 + score5) / 5;
		
		System.out.println("Average = " + average);
	}

}
