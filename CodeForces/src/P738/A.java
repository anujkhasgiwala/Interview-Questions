package P738;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();
		System.out.println(str.replaceAll("ogo(go)*", "***"));
	}
}