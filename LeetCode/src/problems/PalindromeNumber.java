package problems;

public class PalindromeNumber {
    boolean isPalindrome(int num) {
        int x = num, reversed = 0;

        while(x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return num == reversed;
    }
}
