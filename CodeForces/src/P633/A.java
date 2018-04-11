package P633;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		if(a==c || b==c) {
			System.out.println("Yes");
			return;
		} else {
			for (int i = 0; i <= c; i++) {
				for (int j = 0; (a*i)+(b*j) <= c; j++) {
					if(((a*i)+(b*j))==c) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
	}
}