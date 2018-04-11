package P526;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] lights = new int[(int)Math.pow(2, n+1)-2];
		
		for(int i=0;i<lights.length;i++) {
			lights[i]=sc.nextInt();
		}
	}
}