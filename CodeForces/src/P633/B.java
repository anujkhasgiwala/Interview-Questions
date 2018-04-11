package P633;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		List<Long> n = new ArrayList<Long>();
		
		for(long i=1; i<Long.MAX_VALUE;i++) {
			if(factorial(i)%Math.pow(10, m) == 0){
				n.add(i);
			}			
		}
		System.out.println(n.size());
		for (Long long1 : n) {
			System.out.print(long1);
		}
	}

	public static long factorial(long number) {
		long fact =1;
		for(long j=number;j>=1;j--){    
			fact*=j;
		}
		return fact;
	}
}
