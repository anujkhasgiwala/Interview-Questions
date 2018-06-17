package ibm;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
}
