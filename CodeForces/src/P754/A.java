package P754;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int len = s.nextInt();
		int a[] = new int[len];
		for(int i = 0 ; i < len; i++) {
			a[i] = s.nextInt();
		}
		
		List<int[]> result = new ArrayList<>();
	    int i = 0;
	    while (i < len) {
	      int beg = i;
	      int sum = a[i];
	      i++;
	      while (sum == 0 && i < len) {
	        sum += a[i];
	        i++;
	      }
	      
	      int end = i - 1;
	      while (i < len && a[i] == 0) {
	        end++;
	        i++;
	      }

	      if (sum != 0) {
	        result.add(new int[] {beg, end});
	      }
	    }

	    if (result.isEmpty()) {
	      System.out.println("NO");
	    } else {
	      System.out.println("YES");
	      System.out.println(result.size());
	      for (int[] range : result) {
	        System.out.printf("%d %d%n", range[0] + 1, range[1] + 1);
	      }
	    }
	    s.close();
	}
}