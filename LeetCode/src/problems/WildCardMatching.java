package problems;

public class WildCardMatching {
     public boolean isMatch(String s, String p) {
         int i = 0, j = 0, startIndex = 0;
          while(i < p.length()) {
              char pChar = p.charAt(i);
              if (j < s.length() && (pChar == s.charAt(j) || pChar == '?')) {
                  i++;
                  j++;
              } else if(pChar == '*') {
                   startIndex = i;
                   i++;
              }
          }

          return true;
     }
}
