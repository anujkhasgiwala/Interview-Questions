package P622;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		int[] a=new int[n];
		int[][] q = new int[m][3];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 3; j++) {
				q[i][j]=s.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
		}
	}
}