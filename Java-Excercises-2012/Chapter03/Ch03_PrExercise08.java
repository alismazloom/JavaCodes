import javax.swing.*;

public class Ch03_PrExercise08 {
	public static void main(String[] args){
		
		double mass, volume;
		double density;
		String str;
		
		str = JOptionPane.showInputDialog
				("Enter the object mass (in grams): ");
		mass = Double.parseDouble(str);
		
		str = JOptionPane.showInputDialog
				( "Enter density (in grams per"
						+ " cubic centimeters):");
		density = Double.parseDouble(str);
		
		volume = mass / density;
		str = String.format("Volume (in cubic "
				+ "centimeters): %.2f", volume);
		JOptionPane.showMessageDialog(null, str, "Result"
				, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);	
	}
}
