package P746;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		if(b==2*a && c==4*a) {
			System.out.println(a+b+c);
		} else if(b<2*a || c<4*a) {
			do{
				a-=1;
				b=a*2;
				c=a*4;
			} while(a*2<=b && a*4<=c && a>=0);
			System.out.println(a+b+c);
		} else if(a==0 || b==0 || c==0) {
			System.out.println(0);
		}
	}
}