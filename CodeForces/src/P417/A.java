package P417;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt(),d=sc.nextInt(), n=sc.nextInt(), m=sc.nextInt(), k=sc.nextInt();
		if(((n*m)-k) <= 0) {
			System.out.println(0);
			return;
		} else {
			System.out.println(Math.min(c * (((n*m)-k)/n), d * (((n*m)-k)/n) * n) + Math.min(c, d * (((n*m)-k)%n)));
		}
	}
}