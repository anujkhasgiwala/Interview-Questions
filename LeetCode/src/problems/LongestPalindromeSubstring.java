package problems;

public class LongestPalindromeSubstring {
    int low, maxLen;

    public String longestPalindrome(String str) {
        int len = str.length();

        if(len < 2) {
            return str;
        }

        for(int i = 0; i < len - 1; i++) {
            extendPalindrome(str, i, i); // for odd length
            extendPalindrome(str, i, i+1); // for even length
        }

        return str.substring(low, low + maxLen);
    }

    private void extendPalindrome(String str, int j, int k) {
        while(j >= 0 && k < str.length() && str.charAt(j) == str.charAt(k)) {
            j--;
            k++;
        }

        if(maxLen < k - j - 1) {
            low = j + 1;
            maxLen = k - j - 1;
        }
    }

    public static void main(String[] args) {
        System.out.print(new LongestPalindromeSubstring().longestPalindrome("babad"));
    }
}
