package visa;

import java.util.Stack;

public class ParanthesisBalance {
	public static void main(String[] args) {
		String status[] = new String[5];
		for(int i=0;i<5;i++) {
			status[i] = areParenthesisBalanced(new char[5]);
		}
	}

	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	static String areParenthesisBalanced(char exp[]) {
		/* Declare an empty character stack */
		Stack<Character> st=new Stack<Character>();

		//Traverse the given expression to check matching parenthesis
		for(int i=0;i<exp.length;i++) {
			//If the exp[i] is a starting parenthesis then push it
			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
				st.push(exp[i]);

			//If exp[i] is an ending parenthesis then pop from stack and check if the popped parenthesis is a matching pair
			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
				//If we see an ending parenthesis without a pair then return false
				if (st.isEmpty()) {
					return "NO";
				} 

				//Pop the top element from stack, if it is not a pair parenthesis of character then there is a mismatch. This happens for expressions like {(})
				else if (!isMatchingPair(st.pop(), exp[i]) ) {
					return "NO";
				}
			}
		}

		if (st.isEmpty())
			return "YES"; //balanced
		else
		{
			return "NO";
		} 
	}
}