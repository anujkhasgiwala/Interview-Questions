package problems.arrays;

import java.util.*;
import java.util.Scanner;

public class Sparse {
	public static void main(String[] args) {
		List strings = new ArrayList<String>();
		List queries = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			strings.add(sc.next());
		}
		
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			queries.add(sc.next());
		}
		
		for(Object s : queries) {
			System.out.println(Collections.frequency(strings, s));
		}
	}
}