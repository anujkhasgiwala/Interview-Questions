package P424;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}
		
		int q[] = new int[n], Q = 1, temp=1;
		for (int i = 0; i < p.length; i++) {
			for(int j = 2; j<=n;j++) {
				temp ^= ((i+1)%j);
			}
			q[i]=p[i]^temp;
		}
		
		for (int i = 0; i < q.length; i++) {
			Q ^= q[i];
		}
		
		System.out.print(Q);
	}
}