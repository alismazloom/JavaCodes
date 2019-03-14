import java.util.*;
import javax.swing.*;

public class Ch04_PrExercise03 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		
		String str;
		char ch;
		int number;
		
		str = JOptionPane.showInputDialog("Enter"
				+ " an integer between 0 and 35");
		number = Integer.parseInt(str);
				
		if (number >= 0 && number <= 9)
		{
			str = String.format("Number = %d", number);
			JOptionPane.showMessageDialog(null,str ,
			"Output", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (number > 9 && number <= 35)
		{
			ch = (char)(number + 55);
			str = String.format("Associated letter: %c", ch);
			JOptionPane.showMessageDialog(null, str,
			"Output", JOptionPane.INFORMATION_MESSAGE);
		}		
		System.exit(0);
	}
}
