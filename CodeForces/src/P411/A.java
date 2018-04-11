package P411;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length() < 5) {
			System.out.println("Too weak");
			return;
		} else if(!s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")) {
			System.out.println("Too weak");
			return;
		} else {
			System.out.println("Correct");
			return;
		}
	}
}
