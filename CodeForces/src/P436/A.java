package P436;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt();
		List<Candies> candies = new ArrayList<Candies>();
        for (int i = 0; i < n; i++)
        	candies.add(new Candies(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        
        int[] calculation = new int[2];
        for(int i=0;i<=1;i++){
	        calculation[i] = maxCandies(candies, i, x);
        }
        
        System.out.print(Math.max(calculation[0], calculation[1]));
	}
	
	static int maxCandies(List<Candies> candies, int t, int x) {
		List<Candies> candiesCopy = new ArrayList<Candies>(candies);
        candiesCopy.removeIf((c) -> c.t != t || c.h > x);
        if (candiesCopy.isEmpty())
        	return 0;
        Collections.sort(candiesCopy, Comparator.comparing(Candies::getM));
        ArrayList<Candies> candiesCopies1 = new ArrayList<>(candies);
        Candies c = candiesCopy.get(candiesCopy.size()-1);
        candiesCopies1.remove(c);
        return maxCandies(candiesCopies1, 1-t, x+c.m)+1;
    }
}

class Candies {
	int t,h,m;
	
	public Candies(int t, int h, int m) {
		this.t = t;
        this.h = h;
        this.m = m;
	}
	
	public int getM() {
        return m;
    }
}