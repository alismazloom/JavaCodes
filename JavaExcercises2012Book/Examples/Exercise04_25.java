
public class Exercise04_25 {
	public static void main(String[] args) {
		
		String str1, str2, str3;
		
		str1 = "English";
		str2 = "Computer Science"; 
		str3 = "Programming";
		
		System.out.println(str1.compareTo(str2) >= 0);
		System.out.println(str1.compareTo("english") != 0);
		System.out.println(str3.compareTo(str2) < 0);
		System.out.println(str2.compareTo("Chemistry") >= 0);
		
	}
}
