package P612;

import java.util.Scanner;
import java.util.Stack;

public class C {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str = s.next();
		Stack<String> str1 = new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.substring(i, i+1).equals(">") || str.substring(i, i+1).equals("}") || str.substring(i, i+1).equals("]") || str.substring(i, i+1).equals(")")) {
				switch (str.substring(i, i+1)) {
				case ">":
					if(str1.contains("<"))
						str1.remove("<");
					else
						str1.push(str.substring(i, i+1));
					break;
				case "}":
					if(str1.contains("{"))
						str1.remove("{");
					else
						str1.push(str.substring(i, i+1));
					break;
				case "]":
					if(str1.contains("["))
						str1.remove("[");
					else
						str1.push(str.substring(i, i+1));
					break;
				case ")":
					if(str1.contains("("))
						str1.remove("(");
					else
						str1.push(str.substring(i, i+1));
					break;
				}
			} else {
				str1.push(str.substring(i, i+1));
			}
		}
		System.out.println(str1.size());
	}
}