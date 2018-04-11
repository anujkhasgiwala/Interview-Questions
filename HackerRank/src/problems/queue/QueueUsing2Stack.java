package problems.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class QueueUsing2Stack {
	public static void main(String[] args) throws Exception{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String line; int l = 0;
		Stack stack1 = new Stack<Integer>();
		Stack stack2 = new Stack<Integer>();
		while (l < n) {
			line = br.readLine();
			if(line.length() > 1) {
				stack1.push(line.split(" ")[1]);
			} else {
				if(line.equals("2")) {
					if(stack2.isEmpty()) {
						while(!stack1.isEmpty()) {
							stack2.push(stack1.pop());
			            }
					}
					if (!stack2.isEmpty()){                                
	                    stack2.pop(); 
	                }

				} else {
					if(stack2.isEmpty()) {
	                    while(!stack1.isEmpty()) {
	                        stack2.push(stack1.pop());
	                    }
	                    System.out.println(stack2.peek());
	                } 
	                else {
	                    System.out.println(stack2.peek());
	                }
				}
			}
			l++;
		}
	}
}