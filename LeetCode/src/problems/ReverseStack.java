package problems;

import java.util.Stack;

public class ReverseStack {
    Stack<Character> stack = new Stack<>();

    public void reverse() {
        if (!stack.isEmpty()) {
            char x = stack.pop();
            reverse();
            insertAtBottom(x);
        }
    }

    private void insertAtBottom(char x) {
        if (!stack.isEmpty()) {
            char a = stack.pop();
            insertAtBottom(x);
            stack.push(a);
        } else {
            stack.push(x);
        }
    }
}
