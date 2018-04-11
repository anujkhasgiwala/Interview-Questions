package P612;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] f=new int[n];
		for (int i = 0; i < f.length; i++) {
			f[i]=s.nextInt();
		}
		Map<Integer, Integer> pos=new HashMap<Integer, Integer>();
		int t=0;
		for(int i=1;i<=n;i++) {
			for(int j = 0;j<n;j++) {
				if(f[j]==i)
					pos.put(i, j+1);
			}
		}
		
		for(int i=1;i<n;i++) {
			t+=Math.abs(pos.get(i)-pos.get(i+1));
		}
		System.out.println(t);
	}
}