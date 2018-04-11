package P408;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(), s2 = sc.next();
		int[] result1 = new int[256], result2 = new int[256];
		for (char c : s1.toCharArray()) {
            result1[c]++;
        }
		for (char c : s2.toCharArray()) {
            result2[c]++;
        }
		int max = 0;
		for (int i = 0; i < 256; i++) {
            if (result2[i] > 0 && result1[i] == 0) {
                System.out.println(-1);
                return;
            }
            max += Math.min(result2[i], result1[i]);
        }
		System.out.println(max);
	}
}