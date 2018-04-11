package P746;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		String str = s.next();
		StringBuilder newStr = new StringBuilder(n);
		if(n%2 == 0) {
			for (int i=0;i<n;i++) {
				if(i%2==0)
					newStr.setCharAt((i)/2, str.charAt(i));
				else
					newStr.setCharAt((n-i)/2, str.charAt(i));
			}
		} else {
			for (int i=0;i<n;i++) {
				if(i%2==0)
					newStr.setCharAt((n-i)/2, str.charAt(i));
				else
					newStr.setCharAt((i)/2, str.charAt(i));
			}
		}
		System.out.println(newStr.toString());
	}
}