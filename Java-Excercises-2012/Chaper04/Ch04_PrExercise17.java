import java.util.*;
public class Ch04_PrExercise17 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		
		double basePrice;
		double colonialPricePerSF;
		double splitEntryPricePerSF;
		double singleStoryPricePerSF;
		double colonialFinishedAreaInSF;
		double splitEntryFinishedAreaInSF;
		double singleStoryFinishedAreaInSF;

		System.out.printf("Enter the base price: ");
		basePrice = console.nextDouble();
		
		System.out.printf("%nEnter the finished area in "
				+ "square feet of the three models "
				+ "%n(COLONIAL, SPLIT-ENTRY, SINGLE-STORY): ");
		colonialFinishedAreaInSF = console.nextDouble();
		splitEntryFinishedAreaInSF = console.nextDouble();
		singleStoryFinishedAreaInSF = console.nextDouble();
		
		colonialPricePerSF = basePrice * colonialFinishedAreaInSF;
		System.out.printf("%nColonial price per square foot: $%.2f"
				, colonialPricePerSF);
		splitEntryPricePerSF = basePrice * splitEntryFinishedAreaInSF;
		System.out.printf("%nSplit-entry price per square foot: $%.2f"
				, splitEntryPricePerSF);
		singleStoryPricePerSF = basePrice * singleStoryFinishedAreaInSF;
		System.out.printf("%nsingle-story price per square foot: $%.2f"
				, singleStoryPricePerSF);
		
		if (colonialPricePerSF < splitEntryPricePerSF &&
			colonialPricePerSF < singleStoryPricePerSF)
				System.out.printf("%nThe model with the least price "
						+ "per square meter is COLONIAL");
		else if (splitEntryPricePerSF < colonialPricePerSF &&
				splitEntryPricePerSF < singleStoryPricePerSF)	
			System.out.printf("%nThe model with the least price "
					+ "per square meter is SPLIT-ENTRY");
		else if (singleStoryPricePerSF < colonialPricePerSF &&
				singleStoryPricePerSF < splitEntryPricePerSF)
		System.out.printf("%nThe model with the least price "
				+ "per square meter is SINGLE-STORY");
		
	}
}
