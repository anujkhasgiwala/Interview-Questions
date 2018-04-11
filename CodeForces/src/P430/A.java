package P430;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		P[] coord = new P[n];
		for(int i=0;i<n;i++) {
			coord[i] = new P(sc.nextInt(), i);
		}
		
		Arrays.sort(coord,(p, q) -> p.x - q.x);
		
		int[] results = new int[n];
		for (int i = 0; i < coord.length; i++) {
			results[coord[i].pos] = i-(i/2)*2;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(results[i]+" ");
		}		
	}
	
	static class P{
		int x, pos;
		
		P(int x, int pos) {
			this.x = x;
			this.pos = pos;
		}
	}
}
