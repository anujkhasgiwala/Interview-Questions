package P426;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),s=sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}

		Arrays.sort(a);

		if(sum-a[a.length-1]<=s) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}