package glassdoor;

/**
 * Time complexity will be 4^n considering any place can have at-most 4 alphabets and n is number of digits
 * @author anujk
 *
 */
public class PossibleWordsFromPhoneDigits {
	static String phoneDigits[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	static int digit = 0, i = 0;
	
	public static void main(String[] args) {
		int number[] = {2,3,4};
		printPossibleWords(number, number.length);
	}
	
	static void printPossibleWords(int number[], int n) {
		String words[] = new String[n+1];
		printPossibleWordsUtility(number, 0, words, n); 
	}
	
	static void printPossibleWordsUtility(int number[], int digit, String words[], int n) {
		if(digit == number.length) {
			for (String word : words) {
				System.out.println(word);
			}
			return;
		}
		
		while(i < phoneDigits[number[i]].length()) {
			words[digit] = phoneDigits[number[digit]];
			printPossibleWordsUtility(number, digit+1, words, n);
			if(number[digit] == 0 || number[digit] == 1)
				return;
		}
	}
}