import javax.swing.*;
import java.util.*;

public class Exercise3_8 {
	
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
		String str = "Going to the amusement park"; 
		char ch;
		int len;
		int position;
		
		 ch = str.charAt(0);
		 System.out.println("ch = " + ch);
		 ch = str.charAt(10);
		 System.out.println("ch = " + ch);
		 len = str.length();
		 System.out.println("Length = " + len);
		 position = str.indexOf('t');
		 System.out.println("position of 't' = " + position);
		 position = str.indexOf("park");
		 System.out.println("position of 'park' = " + position);
		 
		 System.out.println(str.substring(0, 5));
		 System.out.println(str.substring(13, 22));
		 System.out.println(str.toUpperCase());
		 System.out.println(str.toLowerCase());
		 System.out.println(str.replace('t', '*'));
		 
		 str = "Java programming: from problem analysis to program design";
		 
		 System.out.println(str.indexOf("analysis"));
		 System.out.println(str.substring(5, 16));
		 System.out.println(str.startsWith("Java"));
		 System.out.println(str.startsWith("J"));
		 System.out.println(str.endsWith("."));
		 System.out.println();
		 
		 String str1 = "programming";
		 str = "Java programming: from problem analysis to program design";
		 System.out.println(str.regionMatches(6, str1, 0, str1.length()));
		 System.out.println(str.regionMatches(true, 31, "Analysis", 0, 8));
		 
		 System.out.println();
		 System.out.println(Math.pow(6.5,3.5));
		 
		 JOptionPane.showMessageDialog(null,"The sum of 2 and 3 = " + (2 + 3)
				 ,"Summing",JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(null,"Current temperature: 70 degrees " 
				 ,"Temperature",JOptionPane.INFORMATION_MESSAGE);
		 
		 double x = 75.3987; 
		 double y = 982.89764;
		 
		 System.out.printf("%.2f %n", x);
		 System.out.printf("%.2f %n", y); 
		 System.out.printf("%.3f %n", x);
		 System.out.printf("%.3f %n", y);
		 
		 int x1, y1; 
		 char ch1;
		 
		 x1 = Integer.parseInt("46");
		 y1 = Integer.parseInt("49");
		 
		 System.out.print("Input a character: ");
		 ch1 = console.next().charAt(0);
		 
		 System.out.println(+ x1 +" "+ y1 + " " + ch1); 
		 
	}
}
