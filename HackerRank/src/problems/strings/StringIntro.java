package problems.strings;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		
		System.out.println(string1.length()+string2.length());
		
		if(string1.compareTo(string2) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println(string1.substring(0, 1).toUpperCase() + string1.substring(1) + " " + string2.substring(0, 1).toUpperCase() + string2.substring(1));
	}
}