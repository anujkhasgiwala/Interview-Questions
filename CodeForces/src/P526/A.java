package P526;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		int i=0,j=1;
		while(i<n) {
			if(s.substring(i, i+1).equals(".")) {
				i++;
				continue;
			}				
			while(j<n) {
				int temp=1, k=i+j;
				while(k<n) {
					if(s.substring(k, k+1).equals("*"))
						temp++;
					else
						break;
					if(temp>=5){
						System.out.println("yes");
						return;
					}
					k+=j;
				}
				j++;
			}
			System.out.println("no");
		}
	}
}