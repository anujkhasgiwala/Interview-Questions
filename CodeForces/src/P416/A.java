package P416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = new String[n];
		for(int i = 0; i< n;i++) {
			s[i] = br.readLine();
		}

		long min = -2000000000, max = 2000000000;
		boolean flag = true;
			for (int j = 0; j < s.length; j++) {
				if(s[j].split(" ")[0].equals(">=")) {
					if(s[j].split(" ")[2].equals("Y")) {
						min=Math.max(min, Long.parseLong(s[j].split(" ")[1]));
					} else {
						max=Math.min(max, Long.parseLong(s[j].split(" ")[1])-1);
					}
				} else if(s[j].split(" ")[0].equals("<=")) {
					if(s[j].split(" ")[2].equals("Y")) {
						max=Math.min(max, Long.parseLong(s[j].split(" ")[1]));
					} else {
						min=Math.max(min, Long.parseLong(s[j].split(" ")[1])+1);
					}
				} else if(s[j].split(" ")[0].equals(">")) {
					if(s[j].split(" ")[2].equals("Y")) {
						min=Math.max(min, Long.parseLong(s[j].split(" ")[1])+1);
					} else {
						max=Math.min(max, Long.parseLong(s[j].split(" ")[1]));
					}
				} else {
					if(s[j].split(" ")[2].equals("Y")) {
						max=Math.min(max, Long.parseLong(s[j].split(" ")[1])-1);
					} else {
						min=Math.max(min, Long.parseLong(s[j].split(" ")[1]));
					}
				}
			}
		
		if(min>max) {
			System.out.println("Impossible");
		} else {
			System.out.println(min);
		}
	}
}