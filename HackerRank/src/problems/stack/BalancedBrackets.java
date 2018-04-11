package problems.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[] args) {
		Stack<Character> brackets = new Stack<Character>();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i<n; i++) {
			Character top = 0;
			String line = sc.next();
			for(int j =0; j < line.length(); j++) {
				if (!brackets.isEmpty()) {
					top = brackets.peek();
				}
				brackets.push(line.charAt(j));
				if (!brackets.isEmpty() && brackets.size() > 1) {
					if ((top == '[' && brackets.peek() == ']') ||
							(top == '{' && brackets.peek() == '}') ||
							(top == '(' && brackets.peek() == ')')) {
						brackets.pop();
						brackets.pop();
					}
				}
			}
			//return brackets.isEmpty() ? "YES" : "NO";
		}
	}
}
