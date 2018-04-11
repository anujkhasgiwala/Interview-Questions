package P436;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
		
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		List<Integer> dir = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++) {
				if (s.charAt(j) != '.') {
					int cd = -1;
					if (s.charAt(j) == 'D') {
						cd = 0;
					}
					if (s.charAt(j) == 'L') {
						cd = 1;
					}
					if (s.charAt(j) == 'U') {
						cd = 2;
					}
					if (s.charAt(j) == 'R') {
						cd = 3;
					}
					x.add(i);
					y.add(j);
					dir.add(cd);
				}
			}
		}
		
		int[] solution = new int[m];

		for (int t = 0; t < k; t++) {
			int xx = x.get(t);
			int yy = y.get(t);
			int cd = dir.get(t);
			if (cd == 0) {
				continue;
			}
			if (cd == 1) {
				yy -= xx;
				if (yy >= 0 && yy < m) {
					solution[yy]++;
				}
				continue;
			}
			if (cd == 2) {
				if (xx % 2 == 0) {
					solution[yy]++;
				}
				continue;
			}
			if (cd == 3) {
				yy += xx;
				if (yy >= 0 && yy < m) {
					solution[yy]++;
				}
				continue;
			}
		}

		for (int j = 0; j < m; j++) {
			System.out.println(solution[j] + " ");
		}
	}
}