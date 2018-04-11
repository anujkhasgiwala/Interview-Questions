package P408;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] lane = new int[n];
		
		for (int i = 0; i < n; i++) {
			lane[i] = sc.nextInt();
		}
		
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < lane[i]; ++j) {
                sum += sc.nextInt() * 5;
            }
			sum += lane[i] * 15;
			result = Math.min(result, sum);
		}
		
		System.out.println(result);
	}
}