package P421;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
		int[] ad = new int[a];
		for (int i = 0; i < a; i++) {
			ad[i] = sc.nextInt();
		}
		
		boolean like[] = new boolean[n];
		for(int i=0;i<a;i++) {
			like[ad[i]-1] = true;
		}
		
		for(int i=0;i<n;i++) {
			if(like[i])
				System.out.print("1 ");
			else
				System.out.print("2 ");
		}
	}
}