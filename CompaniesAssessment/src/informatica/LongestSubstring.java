package informatica;

/*Wayland Yu to Everyone (3:39 PM)
With an input string, identify a longest substring with all distinct characters

==============================================================================================================

Input:  findlongestsubstring

Output: The longest substring with all distinct characters is dlongest or ubstring


Input:  longestsubstr

Output: The longest substring with all distinct characters is longest


Input:  abbcdafeegh

Output: The longest substring with all distinct characters is bcdafe


Input:  aaaaaa

Output: The longest substring with all distinct characters is a*/

public class  LongestSubstring {
    public static void main(String[] args) {
        String str = "aaaaaa";
        System.out.println(longestSubString(str));
        String str1 = "findlongestsubstring";
        System.out.println(longestSubString(str1));
    }

    private static String longestSubString(String str) {
        String longest = str;
        int left = 0, right = longest.length();

        while(left < right) {
            left = 0; right = longest.length();
            String temp1 = longest.substring(left, right);
            if(temp1.indexOf(longest.charAt(left)) != -1) {
                left ++;
            }

            String temp2 = longest.substring(left - 1, right - 1);
            if(temp2.indexOf(longest.charAt(right - 1)) != -1) {
                right--;
            }

            longest = str.substring(left, right);
        }

        if(longest.length() == 0) {
            return str.substring(0,1);
        }
        return longest;
    }

    // aaa
    // findlongestsubstrin
}
