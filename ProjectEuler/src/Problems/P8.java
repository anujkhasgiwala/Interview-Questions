package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		System.out.println("Please enter number:");
		Scanner s = new Scanner(System.in);
		String a = new String();
		
		a=s.next();
		Map<Integer, String> b = new HashMap<Integer, String>();
		int product = 1;
		for(int i=0;i<987;i++){
			for(int j=0;j<13;j++){
				product*=(int)a.substring(i, i+13).toCharArray()[j];
			}
			if(b.containsKey(product)) {
				b.put(product, a.substring(i, i+13));
			}
		}
		int maxKey = Collections.max(b.keySet());
		System.out.println(b.get(maxKey));
	}
}