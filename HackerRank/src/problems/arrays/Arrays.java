package problems.arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[sc.nextInt()];
		
		for(int i = 0;i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]+" ");			
		}
	}
}
