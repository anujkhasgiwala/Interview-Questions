package P412;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		String s = sc.next();
		int small = (int) Math.floor(n/k);

		if ((small <= 1)||((n%k==0)&&(small==1))) {
			for (int i=k; i<n;i++){
				System.out.println("RIGHT");
			}

			for (int j=n-1; j>0;j--) {
				System.out.println("PRINT "+s.toCharArray()[j]);
				System.out.println("LEFT");
			}
			System.out.println("PRINT "+s.toCharArray()[0]);
		} else {
			for (int i=0; i<k-1;i++ ){
				System.out.println("LEFT");
			}

			for (int j=0; j<n-1;j++) {
				System.out.println("PRINT "+s.toCharArray()[j]);
				System.out.println("RIGHT");
			}
			System.out.println("PRINT "+s.toCharArray()[n-1]);
		}
	}
}