package P738;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		int[][] plan = new int[n][m];
		int counter = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				plan[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(plan[i][j] == 0) {
					if(j==0) {
						if(plan[i][j+1]==1) {
							counter++;
						}
					} else if(j==m-1) {
						if(plan[i][j-1]==1) {
							counter++;
						}
					} else {
						if(plan[i][j-1]==1 || plan[i][j+1]==1) {
							counter++;
						}
					}
					if(i==0) {
						if(plan[i+1][j]==1) {
							counter++;
						}
					} else if(i==n-1) {
						if(plan[i-1][j]==1) {
							counter++;
						}
					} else {
						if(plan[i-1][j]==1 || plan[i+1][j]==1) {
							counter++;
						}
					}
				}
			}
		}
		System.out.println(counter);
	}
}