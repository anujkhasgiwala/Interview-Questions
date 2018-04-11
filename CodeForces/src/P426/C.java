package P426;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] >=0) {
				sum+=a[i];
			} else {
				continue;
			}
		}
		System.out.println(sum);
	}
}