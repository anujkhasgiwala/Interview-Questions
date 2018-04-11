package P628;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k=s.nextInt();
		String str=s.nextLine();
		List<Character> sub = new ArrayList<Character>();
		
		for(int i = 0 ; i < n ; i++ ) {
			sub.add(str.charAt(i));
		}
		
		System.out.println(findString(sub,k));		
	}
	
	static String findString(List<Character> sub, int k) {
		StringBuilder sub1 = new StringBuilder();
		for (Character c : sub) {
			c=(char)((int)c+k);
			if((int)c>122) {
				c=(char)((int)c-26);
			}
			sub1.append(c);
		}
		return sub1.toString();
	}
}
