package P633;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String cStr=s.next();
		List<String> dStr = new ArrayList<String>();
		List<String> str = new ArrayList<String>();
		int m=s.nextInt();
		for (int i = 0; i < m; i++) {
			dStr.add(s.next());
		}
		
		for (String string : dStr) {
			if(cStr.contains(new StringBuilder(string).reverse().toString())) {
				str.add(string);
			}
		}
		
		System.out.println(str.toString());
	}

}