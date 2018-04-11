package P400;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] s = new String[t];
		for(int i=0;i<t;i++) {
			s[i] = sc.next();
		}

		int i = 1, test = 0;
		List<String> card= new ArrayList<String>();
		while(test<t) {
			while(i<=12) {
				char[] b = s[test].toCharArray();
				if(12 % i == 0) {
					int b1 = 12/i;
					int j=0;
					while(j<b1) {
						boolean flag = true;
						for(int k=0; k<i;k++) {
							if(b[b1*k+j] == 'O')
								flag = false;
						}

						if(flag) {
							card.add(i+"x"+b1);
							break;
						}
						j++;
					}
				}
				i++;
			}
			System.out.print(card.size()/t+" ");
			for (String c : card) {
				System.out.print(c+" \n");
			}
			test++;
		}
	}
}