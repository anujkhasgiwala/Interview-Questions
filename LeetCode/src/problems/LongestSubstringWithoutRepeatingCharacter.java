package problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring("abcabcbb");
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int j = 0, max = 0;
        Map<Character, Integer> occurrence = new HashMap<>();

        for(int i = 0; i < s.length(); ++i) {
            if(occurrence.containsKey(s.charAt(i))) {
                j = Math.max(j, occurrence.get(s.charAt(i)) + 1);
            }
            occurrence.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
