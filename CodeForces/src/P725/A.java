package P725;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=s.next();
		int counter=0, initCounter=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equals("<"))
				counter--;
			else
				counter++;
		}
		if(counter==initCounter)
			System.out.println(0);
		else
			System.out.println(Math.abs(counter-initCounter));
	}

}
