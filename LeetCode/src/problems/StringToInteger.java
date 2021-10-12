package problems;

public class StringToInteger {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();

        if(s.length() == 0 || Character.isAlphabetic(s.charAt(0))) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        int sign = s.charAt(0) == '-' ? -1 : +1;
        int startIndex = s.charAt(0) == '-' || s.charAt(0) == '+' ? 1 : 0;
        for(int i = startIndex; i < s.length(); i++) {
            if(s.charAt(i) == '.' || !Character.isDigit(s.charAt(i))) {
                break;
            } else {
                sb.append(s.charAt(i));
            }
        }

        if(sb.length() == 0) {
            return 0;
        }

        double parsed = Double.parseDouble(sb.toString());
        parsed *= sign;

        if(parsed < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if(parsed > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) parsed;
        }
    }

    public static void main(String[] args) {
        new StringToInteger().myAtoi(" ");
    }
}
