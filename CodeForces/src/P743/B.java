package P743;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(), k=s.nextInt(), count=1;
		do{
			k/=2;
			count++;
		}while(k==k);
		System.out.println(count);
	}
}
