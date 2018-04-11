package P656;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a<13) {
			System.out.print((long)Math.pow(2, a));
		} else {
			System.out.print(8092 * (long)Math.pow(2, a-13));
		}		
		
	}
}