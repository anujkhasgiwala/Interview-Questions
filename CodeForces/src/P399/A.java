package P399;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),p=sc.nextInt(),k=sc.nextInt();
		
		List<Integer> page = new ArrayList<Integer>();
		for (int i = (p-k)>1?(p-k):1; i <= ((p+k)<n?(p+k):n); i++) {
			page.add(i);
		}
		
		if(page.contains(1)) {
			for (Integer integer : page) {
				if(integer != p)
					System.out.print(integer+" ");
				else
					System.out.print("("+integer+")"+" ");
			}
			System.out.print(">>");
		} else if(page.contains(n)) {
			System.out.print("<< ");
			for (Integer integer : page) {
				if(integer != p)
					System.out.print(integer+" ");
				else
					System.out.print("("+integer+")"+" ");
			}
		} else {
			System.out.print("<< ");
			for (Integer integer : page) {
				if(integer != p)
					System.out.print(integer+" ");
				else
					System.out.print("("+integer+")"+" ");
			}
			System.out.print(">>");
		}
	}
}