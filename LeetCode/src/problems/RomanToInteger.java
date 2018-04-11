package problems;

import java.util.TreeMap;

public class RomanToInteger {
	
	private final static TreeMap<String, Integer> romanToInt = new TreeMap<String, Integer>();
	static {
		romanToInt.put("I", 1);
		romanToInt.put("IV", 4);
		romanToInt.put("V", 5);
		romanToInt.put("IX", 9);
		romanToInt.put("X", 10);
		romanToInt.put("XL", 40);
		romanToInt.put("L", 50);
		romanToInt.put("XC", 90);
		romanToInt.put("C", 100);
		romanToInt.put("CD", 400);
		romanToInt.put("D", 500);
		romanToInt.put("CM", 900);
		romanToInt.put("M", 1000);
	}

	public static void main(String[] args) {
		romanToInt("");
	}
	
	static void romanToInt(String s) {
		//Scanner sc = new Scanner(System.in);
		//String romanNumeral = sc.next();
		String romanNumeral="";
		int number = 0;
		for(int i=0;i<romanNumeral.length()-1;i++) {
			number += romanToInt.get(romanNumeral.substring(i, i+1));
		}
		
		System.out.println(number);
    }
}