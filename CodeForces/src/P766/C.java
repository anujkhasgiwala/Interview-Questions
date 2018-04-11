package P766;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=s.next();
		int[] t=new int[26];
/*		for (int i = 0; i < t.length; i++) {
			t[i]=s.nextInt();
		}*/
		List<String> sub1=new ArrayList<String>();
		for(int i = 0 ; i < str.length() ; i++ ) {
			for(int j = 1 ; j <= str.length() - i ; j++ ) {
				sub1.add(str.substring(i, i+j));
			}
		}
		System.out.println(sub1.size());
	}
}
