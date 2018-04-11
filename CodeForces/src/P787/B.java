package P787;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[][] grp = new int[m][];
		for(int i=0;i<m;i++) {
			int k=sc.nextInt();
			grp[i][0] = k; 
			for(int j=1;j<k;j++) {
				grp[i][k] = sc.nextInt();
			}
		}
		
		System.out.println();
	}
}