package P424;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = sc.nextInt();
		int[][] people = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				people[i][j] = sc.nextInt();
			}
		}
		
		int m = 1000000, sum = s;
		double distance[] = new double[n];
		for (int i = 0; i < n; i++) {
			sum+=people[i][2];
		}
		if(sum < m) {
			System.out.println(-1);
			return;
		} else {
			for (int i = 0; i < n; i++) {
				if(s<m) {
					s+=people[i][2];
					distance[i] = Math.sqrt(Math.pow(people[i][0], 2)+Math.pow(people[i][1], 2));
				}
			}
		}
		
		Arrays.sort(distance);
		System.out.print(new DecimalFormat("#.#######").format(distance[n-1]));
	}
}