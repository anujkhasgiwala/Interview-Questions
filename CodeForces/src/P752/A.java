package P752;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),k=s.nextInt();
		k--;
		int r=k/2/m+1;
		int d=k/2%m+1;
		char str = k%2 ==0? 'L' : 'R';
		System.out.println(r+" "+d+" "+str);
	}
}