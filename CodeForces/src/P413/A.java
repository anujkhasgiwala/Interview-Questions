package P413;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),min=sc.nextInt(),max=sc.nextInt();
		int[] t = new int[m];
		for(int i=0;i<m;i++){
			t[i] = sc.nextInt();
		}
		Arrays.sort(t);
		int result = 0, min0=t[0],max0=t[t.length-1];

		if(min0<min || max0>max){
			System.out.println("Incorrect");
		} else {
			if(min0>min || max0 < max) {
				result++;
			}
			System.out.println(m + result <= n ? "Correct" : "Incorrect");
		}
	}
}