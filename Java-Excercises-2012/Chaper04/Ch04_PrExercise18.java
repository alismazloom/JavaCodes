import javax.swing.*;
public class Ch04_PrExercise18 {
	public static void main(String[] args) {
		
		String ch, str;
		String weight, waist, wrist, hip, forearm;
		double A1, A2, A3, A4, A5, B = 0;
		double bodyWeight, waistSize, wristSize;
		double hipSize, forearmSize;
		double bodyFat, bodyFatPercentage;
		
		ch = JOptionPane.showInputDialog("Enter the gender of the"
				+ " patient (m as male or f as female): ");
		weight = JOptionPane.showInputDialog("Enter the body weight: ");
		bodyWeight = Double.parseDouble(weight);
		
		waist = JOptionPane.showInputDialog("Enter the "
				+ "Waist measurement (at navel): ");
		waistSize = Double.parseDouble(waist);
		
		if (ch.equals("f") == true)
		{
			wrist = JOptionPane.showInputDialog("Enter the "
					+ "Wrist measurement (at fullest point): ");
			wristSize = Double.parseDouble(wrist);
			hip = JOptionPane.showInputDialog("Enter the "
					+ "Hip measurement (at fullest point): ");
			hipSize = Double.parseDouble(hip);
			forearm = JOptionPane.showInputDialog("Enter the "
					+ "Forearm measurement (at fullest point): ");
			forearmSize = Double.parseDouble(forearm);
			
			A1 = (bodyWeight * 0.732) + 8.987;
			A2 = wristSize / 3.140;
			A3 = waistSize * 0.157;
			A4 = hipSize * 0.249;
			A5 = forearmSize *  0.434;
			B = A1 + A2 - A3 - A4 + A5;	
		}
		else if (ch.equals("m") == true)
		{
			A1 = (bodyWeight * 1.082) + 94.42;
			A2 = waistSize * 4.15;
			B = A1 - A2;
		}
		else
			JOptionPane.showMessageDialog(null, "Enter a valid "
		+ "gender", "Invalid Gender", JOptionPane.ERROR_MESSAGE);
		bodyFat = bodyWeight - B;
		bodyFatPercentage = bodyFat * 100 / bodyWeight;
		str = String.format("Body fat: %.2f%nBody fat percentage: "
							+ "%.2f", bodyFat, bodyFatPercentage);
		JOptionPane.showMessageDialog(null, str, "Results", 
									JOptionPane.INFORMATION_MESSAGE);
	}

}
