package problems;

import java.util.Stack;

public class ValidParentheses {

	static boolean isValid(String parathesis) {
		if(parathesis.length() == 0 || parathesis.equals(""))
			return true;
		Stack<String> balance = new Stack<String>();
		
		for (String bracket : parathesis.split("")) {
			if(balance.isEmpty()) {
				balance.push(bracket);
			} else {
				if((bracket.equals(")") && balance.peek().equals("(")) || (bracket.equals("}") && balance.peek().equals("{")) || (bracket.equals("]") && balance.peek().equals("[")))
					balance.pop();
				else
					balance.push(bracket);
			}
		}
		
		if(balance.size() == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isValid("{[]}"));
	}
}