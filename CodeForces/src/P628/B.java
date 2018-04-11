package P628;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int counter=0;
		String str=s.nextLine();
		List<String> sub = new ArrayList<String>();
		int len = str.length();
		for(int i = 0 ; i < len ; i++ ) {
			for(int j = 1 ; j <= len - i ; j++ ) {
				sub.add(str.substring(i, i+j));
			}
		}
		
		for (String string : sub) {
			if(Integer.parseInt(string)%4==0)
				counter++;
		}
		
		System.out.println(counter);
	}
}
