import java.util.*;

public class Exercise2_18 {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] arg) {
		
		double roomHeight, roomLength, roomWidth, roomArea;
		double windowHeight, windowWidth, windowArea;
		double doorHeight, doorWidth, doorArea;
		double shelfHeight, shelfWidth, shelfArea;
		double paintCostRate, totalPaintCost;
		double carpetInsCostRate, totalcarpetInsCost;
		
		System.out.print("Input room's length, width and height in feet: ");
		roomLength = console.nextDouble();
		roomWidth = console.nextDouble();
		roomHeight = console.nextDouble();
		roomArea =  2 * (roomHeight * roomLength) + 
					2 * (roomHeight * roomWidth);
		
		System.out.print("Input door's width and height in feet: ");
		doorWidth = console.nextDouble();
		doorHeight = console.nextDouble();
		doorArea = doorWidth * doorHeight;
		
		System.out.print("Input window's width and height in feet: ");
		windowWidth = console.nextDouble();
		windowHeight = console.nextDouble();
		windowArea = windowHeight * windowWidth;
		
		System.out.print("Input bookshelf's width and"
				+ " height in feet: ");
		shelfWidth = console.nextDouble();
		shelfHeight = console.nextDouble();
		shelfArea = shelfWidth * shelfHeight;
		
		System.out.print("Input cost of painting the "
				+ "walls per square foot: ");
		paintCostRate = console.nextDouble();
		totalPaintCost = paintCostRate *
						(roomArea - doorArea - 2 * windowArea - shelfArea);
		
		
		System.out.print("Input cost of installing "
				+ "carpet per square foot: ");
		carpetInsCostRate = console.nextDouble();
		totalcarpetInsCost = carpetInsCostRate * roomLength * roomWidth;
		
		System.out.println("Cost of painting the walls is $" 
				+ totalPaintCost);
		System.out.println("Cost of installing the carpet is $" 
						+ totalcarpetInsCost);
	}

}
