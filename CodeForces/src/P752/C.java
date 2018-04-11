package P752;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		String str = s.nextLine();
		int x0=0,y0=0;
		Map<Integer, Integer> state = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < str.toCharArray().length; i++) {
			if(str.substring(i, i+1).equals("L")) {
				x0-=x0;
			} else if(str.substring(i, i+1).equals("R")) {
				x0+=x0;
			} else if(str.substring(i, i+1).equals("U")) {
				y0+=y0;
			} else {
				y0-=y0;
			}
			if(!(state.containsKey(x0) && state.containsValue(y0)))
				state.put(x0, y0);
		}
	}
}