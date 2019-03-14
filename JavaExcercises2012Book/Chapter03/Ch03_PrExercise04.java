import javax.swing.*;

public class Ch03_PrExercise04 {
	static final double POUNDS_PER_KILOGRAM = 2.2;
	
	public static void main(String[] args) {
		
		String str;
		double weightInKilos;
		double weightInPounds;
		
		str = JOptionPane.showInputDialog("Enter the weight of"
				+ " a person in kilograms: ");
		
		weightInKilos = Double.parseDouble(str);
		weightInPounds = POUNDS_PER_KILOGRAM * weightInKilos;
		
		str = String.format("The weight in kilograms: %.2f "
				+ "%nThe weight in pounds: %.2f" 
				,weightInKilos ,weightInPounds);
		
		JOptionPane.showMessageDialog(null, str,"Weight conversion"
				, JOptionPane.INFORMATION_MESSAGE);
	
		System.exit(0);
		
	}
}
