package P412;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		Integer[] speed = new Integer[n];
		for(int i=0;i<n;i++) {
			speed[i] = sc.nextInt();
		}
		
		Arrays.sort(speed, Collections.reverseOrder());
		System.out.println(speed[k-1]);
	}
}