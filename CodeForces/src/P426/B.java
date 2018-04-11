package P426;

import java.util.Arrays;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int s = 0;
		if(n%2 == 0) {
			for (int i = 0; i < n/2; i++) {
				if(Arrays.equals(a[i], a[n-i-1])) {
					s++;
				}
			}
			System.out.println(n/s);
		} else {
			System.out.println(n);
		}
	}
}