package P754;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		char a[][] = new char[4][4];
		String res = new String();
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<4;i++){
			a[i]=s.nextLine().toCharArray();
		}
		
		for(int k=0;k<4;k++){
			for(int l=0;l<1;l++){
				if(a[k][l]==('x')){
					if(a[k][l+1]==('x') && a[k][l+2]==('x')) {
						res="Yes";
					} else if(a[k][l+1]==('.') && a[k][l+2]==('x')) {
						res="Yes";
					} else if(a[k][l+1]==('x') && a[k][l+2]==('.')) {
						res="Yes";
					}
				}
			}
		}
		
		for(int k=0;k<1;k++){
			for(int l=0;l<4;l++){
				if(a[k][l]==('x')){
					if(a[k+1][l]==('x') && a[k+2][l]==('x')) {
						res="Yes";
					} else if(a[k+1][l]==('.') && a[k+2][l]==('x')) {
						res="Yes";
					} else if(a[k+1][l]==('x') && a[k+2][l]==('.')) {
						res="Yes";
					}
				}
			}
		}
		
		for(int k=0;k<1;k++){
			for(int l=0;l<1;l++){
				if(a[k][l]==('x')){
					if(a[k+1][l+1]==('x') && a[k+2][l+2]==('x')) {
						res="Yes";
					} else if(a[k+1][l+1]==('.') && a[k+2][l+2]==('x')) {
						res="Yes";
					} else if(a[k+1][l+1]==('x') && a[k+2][l+2]==('.')) {
						res="Yes";
					}
				}
			}
		}
		
		if(res==("Yes")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}