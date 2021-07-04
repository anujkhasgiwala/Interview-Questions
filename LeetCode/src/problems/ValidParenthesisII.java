package problems;

public class ValidParenthesisII {
    public boolean checkValidString(String str) {
        if(str == null || str.isEmpty()) {
            return true;
        }

        int low = 0, high = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                low++;
                high++;
            } else {
                if(low > 0) {
                    low--;
                }
                high++;
            }

            if(high < 0) {
                return false;
            }
        }

        return low == 0;
    }
}
