package P421;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if(s.length()==1) {
			System.out.println("NO");
			return;
		}
		for(int i=0;i<s.toCharArray().length/2; i++) {
			if(s.toCharArray()[i] != s.toCharArray()[s.toCharArray().length-i-1]) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}
}