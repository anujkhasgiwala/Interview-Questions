package P424;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		//x sitting X standing
		int countX = 0, countx=0;
		for(int i=0;i<n;i++){
			if(s.substring(i, i+1).equals("x")) {
				countx++;
			} else {
				countX++;
			}
		}
		
		if(countx == n/2) {
			System.out.println(0);
			System.out.print(s);
		} else {
			System.out.println(Math.abs(n/2-countx));
			if(countx>countX) {
				for (int i = 0; i < Math.abs(n/2-countx); i++) {					
					s=s.replaceFirst("x", "X");
				}
				System.out.print(s);
			} else {
				for (int i = 0; i < Math.abs(n/2-countx); i++) {
					s=s.replaceFirst("X", "x");
				}
				System.out.print(s);
			}
		}
	}
}