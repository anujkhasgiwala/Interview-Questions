package P606;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),x0=s.nextInt(),y0=s.nextInt(), counter=0;
		List<String> c = new ArrayList<String>();
		
		for(int i=0;i<100000;i++) {
			c.add(s.nextLine().substring(i));
		}
		
		boolean[] r = new boolean[c.size()];
		
		for(String str:c) {
			if(str.equals("L"))
				y0-=1;
			if(str.equals("R"))
				y0+=1;
			if(str.equals("U"))
				x0-=1;
			if(str.equals("D"))
				x0+=1;
		}
		
	}
}
