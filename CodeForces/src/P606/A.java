package P606;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		a-=s.nextInt();
		b-=s.nextInt();
		c-=s.nextInt();
		
		int extra = 0;
		if(a > 0) {
			extra+=a/2;	
		} if(b > 0) {
			extra+=b/2;	
		} if(c > 0) {
			extra+=c/2;	
		} 
		
		int def=0;
		if(a < 0) {
			def-=a;
		} if(b< 0) {
			def-=b;	
		} if(c < 0) {
			def-=c;	
		}
		
		System.out.println(extra>=def?"Yes":"No");
	}
}