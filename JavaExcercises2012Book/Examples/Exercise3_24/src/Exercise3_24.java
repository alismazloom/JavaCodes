
import java.io.*;

public class Exercise3_24 {
	public static void main(String[] args)
								throws FileNotFoundException
	{
		PrintWriter outfile; 
		double distance = 375; 
		double speed = 58; 
		double travelTime;
		
		outfile = new PrintWriter("travel.dat"); 
		outfile.printf("%.2f %.2f", distance, speed);
		travelTime = distance / speed;
		outfile.printf(" %.2f", travelTime);
		outfile.close();
	}
	
}
