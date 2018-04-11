package P622;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n = s.nextLong();
		int i=0;
		for(i=1;n>=1;i++)
			n-=i;
		System.out.println(n+i-1);		
	}
}