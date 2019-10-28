package problems.arrays;

import java.util.Scanner;

public class Manipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int array[] = new int[n];
		
		for(int i = 0;i<m;i++) {
			int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
			
			array[a-1] += k;
			if((b-1)<n)
				array[b-1]-=k;
		}
		
		int max = 0, temp = 0;
		for(int i=0;i<n;i++) {
			temp += array[i];
		    if(temp> max) max=temp;
		}
		System.out.println(max);
		sc.close();
	}
}