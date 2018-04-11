package P743;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(), a=s.nextInt(), b=s.nextInt();
		String str = s.next();
		if(str.substring(a-1, a).equals(str.substring(b-1, b))){
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}
}