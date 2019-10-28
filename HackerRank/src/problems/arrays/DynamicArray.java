package problems.arrays;

import java.util.*;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		int lastAnswer = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		int[][] queries = new int[q][3];
		ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>(n);
		
		for (int i = 0; i < q; i++) {
			queries[i][0] = sc.nextInt();
			queries[i][1] = sc.nextInt();
			queries[i][2] = sc.nextInt();
		}
		
		for (int i = 0; i < q; i++) {
			int index = (queries[i][1]^lastAnswer)%n;
			if(queries[i][0] == 1) {
				seqList.get(index).add(queries[i][2]);
			} else {
				lastAnswer = queries[i][2]%seqList.get(index).size();
				System.out.println(lastAnswer);
			}
		}
		
		sc.close();
	}
}
