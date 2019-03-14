import java.util.*;

public class Exercise2_12 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] arg) {
		
		int totalSeconds;
		int hours, minutes, seconds;
		
		System.out.print("Hours, Minutes, Seconds: ");
		hours = console.nextInt();
		minutes = console.nextInt();
		seconds = console.nextInt();
		
		totalSeconds = hours * 60 * 60 + minutes * 60 + seconds;
		
		System.out.println("Elapsed time: " + totalSeconds);
		System.out.println();
	}
}
