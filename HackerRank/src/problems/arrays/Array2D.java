package problems.arrays;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		int[][] a = new int[6][6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			for(int j = 0; j<6;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			int sum1 = 0;
			for (int j = 0; j < 4; j++) {
				sum1 = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				if(sum<sum1)
					sum = sum1;
			}			
		}
		System.out.print(sum);
		
		sc.close();
	}
}