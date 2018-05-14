package problems;

import java.util.*;

public class RomanToInteger {
	
	private final static TreeMap<String, Integer> romanToInt = new TreeMap<String, Integer>();
	static {
		romanToInt.put("I", 1);
		romanToInt.put("V", 5);
		romanToInt.put("X", 10);
		romanToInt.put("L", 50);
		romanToInt.put("C", 100);
		romanToInt.put("D", 500);
		romanToInt.put("M", 1000);
	}

	static public int romanToInt(String roman) {
		int value = 0;
		int[] number = new int[roman.length()];

        for(int i=0;i< roman.length();i++) {
			number[i] = romanToInt.get(roman.substring(i, i+1));
		}

		for(int i = 0 ; i< number.length - 1 ; i++) {
			if(number[i] < number[i+1])
				value-=number[i];
			else
				value+=number[i];
		}

		return value+number[number.length-1];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		String romanNumeral = sc.next();
        System.out.println(romanToInt(romanNumeral));
        sc.close();
    }
}