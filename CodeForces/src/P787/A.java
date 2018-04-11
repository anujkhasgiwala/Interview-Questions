package P787;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
		
		List<Integer> rick = new ArrayList<Integer>();
		for(int i=0;i<=100;i++) {
			rick.add(b+i*a);
		}
		List<Integer> morty = new ArrayList<Integer>();
		for(int i=0;i<=100;i++) {
			morty.add(d+i*c);
		}
		
		for(int r : rick) {
			if(morty.contains(r)) {
				System.out.println(r);
				return;
			}
		}
		System.out.println(-1);
	}
}