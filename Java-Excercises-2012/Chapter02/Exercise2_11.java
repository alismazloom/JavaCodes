import java.util.*;

public class Exercise2_11 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] arg) {
		
		int totalSeconds;
		int hours, minutes, seconds;
		
		System.out.print("Input elapsed time: ");
		totalSeconds = console.nextInt();
		
		hours = totalSeconds / (60 * 60);
		minutes = (totalSeconds % (60 * 60)) / 60;
		seconds = (totalSeconds % (60 * 60)) % 60;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		System.out.println();
	}
}
