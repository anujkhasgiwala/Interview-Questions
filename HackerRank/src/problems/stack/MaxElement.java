package problems.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxElement {
	public static void main(String[] args) throws Exception{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] query = new int[n][2];
		
		String line; int l = 0;
		while (l < n) {
			line = br.readLine();
			if(line.length() > 1) {
				query[l][0] = Integer.parseInt(line.split(" ")[0]);
				query[l][1] = Integer.parseInt(line.split(" ")[1]);
			} else {
				query[l][0] = Integer.parseInt(line);
				
			}
			l++;
		}

		int top=0;
		List stack = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if(query[i][0] == 1) {
				stack.add(top, query[i][1]);
				top++;
			} else if(query[i][0] == 2) {
				stack.remove(top);
				top--;
			} else {
				System.out.println(Collections.max(stack));
			}
		}
	}
}