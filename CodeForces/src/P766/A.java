package P766;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next(), b=s.next();
		int counter=0;
		List<String> sub1=new ArrayList<String>(), sub2 =new ArrayList<String>(); 
		for(int i = 0 ; i < a.length() ; i++ ) {
			for(int j = 1 ; j <= a.length() - i ; j++ ) {
				sub1.add(a.substring(i, i+j));
			}
		}
		for(int i = 0 ; i < b.length() ; i++ ) {
			for(int j = 1 ; j <= b.length() - i ; j++ ) {
				sub2.add(b.substring(i, i+j));
			}
		}
		
		for (String string : sub1) {
			if (!sub2.contains(string)) {
				counter++;
			}
		}
		
		if(counter > 0) {
			if(a.length() > b.length())
				System.out.println(a.length());
			else
				System.out.println(b.length());
		} else {
			System.out.println(-1);
		}
	}
}