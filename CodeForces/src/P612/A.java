package P612;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),p=s.nextInt(),q=s.nextInt();
		String str = s.next();
		for(int i=0;i<=100;i++) {
			for(int j=0;j<=100;j++) {
				if(i*p+j*q == n) {
					System.out.println(i+j);
				}
				int k=0,l=0;
				while(k<i) {
					k++;
					System.out.println(str.substring(k*p, k*p+p));
				}
				while(l<j) {
					l++;
					System.out.println(str.substring(i*p+l*q, i*p+l*q+q));
				}
				return;
			}
		}
		System.out.println("-1");
	}
}