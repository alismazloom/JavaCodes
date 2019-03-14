import java.util.*;
public class Ch04_PrExercise16 {
	static Scanner console = new Scanner(System.in);
	
	static final double COLORING_COST_PER_INCH = 0.10;
	static final double REGULAR_FRAME_COST_PER_INCH = 0.15;
	static final double FANCY_FRAME_COST_PER_INCH = 0.25;
	static final double CARDBOARD_COST_PER_SQUARE_INCH = 0.02;
	static final double GLASS_COST_PER_SQUARE_INCH = 0.07;
	static final double CROWN_COST = 0.35;
	
	public static void main(String[] args) {
		
		double frameLength, frameWidth;
		char frameType;
		String frameColor = "";
		int noOfCrowns = 0;
		double frameCost = 0;
		double coloringCost = 0;
		double cardboardCost = 0;
		double glassCoverCost = 0;
		double crownCost = 0;
		double frameTotalCost = 0;
		
		System.out.print("Enter the length and width "
				+ "of your frame: ");
		frameLength = console.nextDouble();
		frameWidth = console.nextDouble();
		
		System.out.printf("%nEnter the type of the frame,"
				+ "%n'r' or 'R' for REGULAR"
				+ "%n'f' or 'F' for FANCY: ");
		frameType = console.next().charAt(0);
		
		System.out.printf("%nInput your favorite color: %s", 
				frameColor);
		frameColor = console.next();
		
		System.out.printf("%nEnter the number of crowns: ");
		noOfCrowns = console.nextInt();
		
		coloringCost =  2 * (frameLength + frameWidth) 
						* COLORING_COST_PER_INCH;
		
		cardboardCost = (frameLength * frameWidth) 
						* (CARDBOARD_COST_PER_SQUARE_INCH);	
		glassCoverCost = (frameLength * frameWidth) 
					* (GLASS_COST_PER_SQUARE_INCH );
		crownCost = noOfCrowns * CROWN_COST;
		if (frameType == 'r' || frameType == 'R')
			frameCost = 2 * (frameLength + frameWidth) 
						* REGULAR_FRAME_COST_PER_INCH;
		else if (frameType == 'f' || frameType == 'F')
			frameCost = 2 * (frameLength + frameWidth)
						* FANCY_FRAME_COST_PER_INCH;
		else
			System.out.printf("%nThe frame type is not valid.");
		
		frameTotalCost = frameCost + coloringCost 
				+ cardboardCost + glassCoverCost + crownCost;
			
		System.out.printf("%nCost of framing the picture with "
		+ "frame color " + frameColor + " is: $%.2f", frameTotalCost);		
	}
}
