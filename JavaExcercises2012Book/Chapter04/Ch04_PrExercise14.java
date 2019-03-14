import java.util.*;
public class Ch04_PrExercise14 {
	static Scanner console = new Scanner(System.in);
	static final int POINTS_PER_INCH = 72;
	
	public static void main(String[] args) {
		
		double paperLength, paperWidth;
		double topMargin, bottomMargin;
		double leftMargin, rightMargin;
		int noOfCharsPerLine;
		int noOfLinesPerPaper;
		int noOfcharacterPoints;
		int lineSpaceStatus;
		
		System.out.printf("Enter the length and"
				+ " width of your paper in inches:");
		paperLength = console.nextDouble();
		paperWidth = console.nextDouble();
		
		System.out.printf("%nEnter the top, bottom, left, right"
					+ " margin of your paper in inches:");
		topMargin = console.nextDouble();
		bottomMargin = console.nextDouble();
		leftMargin = console.nextDouble();
		rightMargin = console.nextDouble();
		
		System.out.printf("%nEnter the point size of each line: ");
		noOfcharacterPoints = console.nextInt();
		
		System.out.printf("%nIf the lines are single-spaced,"
				+ " input '1'%nif they are double-spaced,"
				+ " input '2': ");
		lineSpaceStatus = console.nextInt();
		if (lineSpaceStatus != 1 && lineSpaceStatus != 2)
			System.out.printf("The line space entry "
					+ "is not valid.");
		else
			noOfcharacterPoints *= 2;
		
		noOfCharsPerLine = (int)(paperWidth - leftMargin - rightMargin)
						* POINTS_PER_INCH / noOfcharacterPoints;
		
		noOfLinesPerPaper = (int)(paperLength - topMargin - bottomMargin)
								* POINTS_PER_INCH / noOfcharacterPoints;
		
		System.out.printf("%nNumber of characters per line: %d",
				noOfCharsPerLine);
		System.out.printf("%nNumber of lines per paper: %d", 
				noOfLinesPerPaper);
	}

}
