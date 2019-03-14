	//Java program to create a window and evaluates the input value.
import java.util.*;
import javax.swing.*;

public class Ch05_PrExercise01 {

	static Scanner console = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String str;
		int num;
		
		str = JOptionPane.showInputDialog("Enter an Integer:");
		num = Integer.parseInt(str);
		
		if (num < 0) 
			str = (num + " is negative");
		else if(num == 0) 
			str = ("The input is zero");
		else 
			str = (num + " is positive");
		
		JOptionPane.showMessageDialog(null, str,"Result",JOptionPane.INFORMATION_MESSAGE);	
	}
}

