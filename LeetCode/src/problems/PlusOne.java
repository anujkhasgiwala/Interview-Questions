package problems;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		int carry = 0;
		for(int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] == 9 && i == digits.length - 1) {
				digits[i] = 0;
				carry = 1;
			} else if(digits[i] == 9 && carry == 1) {
				digits[i] = 0;
				carry = 1;
			} else if(carry == 0 && i == digits.length - 1)
				digits[i] ++;
			else if(carry == 1) {
				digits[i] ++;
				carry = 0;
			}
		}

		if(carry == 1) {
			int digits1[] = new int[digits.length + 1];
			digits1[0] = 1;
			for(int i = digits.length - 1; i >= 0; i--)
				digits1[i+1] = digits[i];
			carry = 0;
			return digits1;
		}
		return digits;
	}

	public static void main(String[] args) {
		int digit[] = {9,9}; 
		plusOne(digit);
	}
}