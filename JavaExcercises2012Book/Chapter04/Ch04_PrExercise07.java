import java.util.*;
public class Ch04_PrExercise07 {
	static Scanner console = new Scanner(System.in);
	static final int COOKIES_PER_BOX = 24;
	static final int BOXES_PER_CONTAINER = 75;
	
	public static void main(String[] args) {
		
		int noOfCookies;
		int noOfBoxes;
		int noOfContainers;
		
		System.out.print("Input the number of cookies: ");
		noOfCookies = console.nextInt();
		
		noOfBoxes = noOfCookies / COOKIES_PER_BOX;
		noOfContainers = noOfBoxes / BOXES_PER_CONTAINER;
		
		if ((noOfCookies % COOKIES_PER_BOX) >= 0)
			noOfCookies %= COOKIES_PER_BOX;
		
		if ((noOfBoxes % BOXES_PER_CONTAINER) >= 0)
			noOfBoxes %= BOXES_PER_CONTAINER;
		
		System.out.println("Number of containers: " 
							+ noOfContainers);
		System.out.println("Number of boxes: " 
				+ noOfBoxes);
		System.out.println("Number of remaining cookies: " 
				+ noOfCookies);		
	}
}
