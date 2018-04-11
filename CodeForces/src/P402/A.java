package P402;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),v=sc.nextInt();
		int min = 0;
		while(a > 0) {
			int nuts = Math.min(k, b + 1);
			b = Math.max(0, b - k + 1);
			a -= nuts*v;
			min ++;
		}
		System.out.println(min);
	}
}