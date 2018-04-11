package P606;

import java.util.Scanner;

public class C {
	public static void main() {
		Scanner s = new Scanner(System.in);
		
		int len = s.nextInt();
		int a[] = new int[len];
		for(int i = 0 ; i < len; i++) {
			a[i] = s.nextInt();
		}
		
		int counter = 0;
		
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len-1;j++) {
				if(a[i]>a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i]=temp;
					counter++;
				}
			}
		}
		
		System.out.println(counter);
		s.close();
	}
}