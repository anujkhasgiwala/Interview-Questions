package P399;

import java.util.Scanner;
import java.util.Stack;

public class B {
	public static void main(String[] args) {
		Stack<String> balls = new Stack<String>();
		Scanner sc  = new Scanner(System.in);
		int n  = sc.nextInt();
		String s = sc.next();
		for(int i=1;i<=n;i++) {
			balls.push(s.substring(i-1, i));
		}
		
		while(balls.peek().equals("R")) {
		}
	}
}
