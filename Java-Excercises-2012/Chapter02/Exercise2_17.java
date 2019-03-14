import java.util.*;

public class Exercise2_17 {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] arg) {
		
		String str1, str2, str3;
		
		System.out.print("Input three strings: ");
		str1 = console.next();
		str2 = console.next();
		str3 = console.next();
		
		System.out.println("Permutation 1 = " + str1 + str2 + str3);
		System.out.println("Permutation 2 = " + str1 + str3 + str2);
		System.out.println("Permutation 3 = " + str2 + str1 + str3);
		System.out.println("Permutation 4 = " + str2 + str3 + str1);
		System.out.println("Permutation 5 = " + str3 + str1 + str2);
		System.out.println("Permutation 6 = " + str3 + str2 + str1);
	}

}
