package P475;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int k = sc.nextInt();
		String[][] seats = new String[4][11];
		if(k>4) {
			seats[0][0]="O";
			seats[1][0]="O";
			seats[2][0]="O";
			seats[3][0]="O";
		}
		k-=4;
		for(int j=1;j<11;j++) {
			for(int i=0;i<4;i++) {
				if(i!=2 && k>=0) {
					seats[i][j]="O";
				} else if(i!=2 && k<0){
					seats[i][j]="#";
				} else {
					seats[i][j]=".";
				}
				k--;
			}
		}
		System.out.println("+------------------------+");
		for (int i = 0; i < 4; i++) {
			System.out.print("|");
			for (int j = 0; j < 11; j++) {
				System.out.print(seats[i][j]+".");
			}
			if(i==0) {
				System.out.println("|D|)");
			} else if(i>0 && i<2){
				System.out.println("|.|");
			} else if(i==2) {
				System.out.println("..|");
			} else {
				System.out.println("|.|)");
			}
			
		}
		System.out.println("+------------------------+");
	}
}
