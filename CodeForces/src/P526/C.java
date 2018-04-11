package P526;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt(),hr=sc.nextInt(),hb=sc.nextInt(),wr=sc.nextInt(),wb=sc.nextInt();
		int nr=1,nb=1;
		for(int i=0,j=0;i<Math.pow(10, 9);i++, j++) {
			if(i*wr+j*wb == c) {
				nr=i;nb=j;
				break;
			}
		}
		System.out.println(nr*hr+nb*hb);
	}
}