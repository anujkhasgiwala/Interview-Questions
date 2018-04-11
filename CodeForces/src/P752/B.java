package P752;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine(), t=s.nextLine();
		List<String> pair = new ArrayList<String>();
		for (int i = 0; i < str.toCharArray().length; i++) {
			if(str.toCharArray()[i]!=t.toCharArray()[i]){
				if(!(pair.contains(str.substring(i,i+1)) && pair.contains(t.substring(i,i+1)))) {
					pair.add(str.substring(i,i+1));
					pair.add(t.substring(i,i+1));
				}
			}
		}
		
		System.out.println(pair.size()/2);
		for (int i = 0; i < pair.size(); i+=2) {
			System.out.println(pair.get(i)+" "+pair.get(i+1));
		}
	}
}