package workfront;

public class Task3 {
	public static void main(String[] args) {
		solution("ABBCC");
	}
	public static String solution(String S) {
        StringBuffer sb = new StringBuffer();
        char ch=(char)-1, prevCh=S.charAt(0);
        int j=0;
        for (int i = 1; i < S.length(); i += 2) {
            ch = S.charAt(i);
            prevCh = S.charAt(i - 1);
            String newStr = applyRule(prevCh, ch);
            sb.append(newStr);
            if (sb.length() > 1) {
                newStr = applyRule(sb.charAt(sb.length() - 2), sb.charAt(sb.length() - 1));
                if (newStr != null) {
                    sb.replace(sb.length() - 1, sb.length() - 1, newStr);
                }
            }
        }
        return sb.toString();
    }
    
    private static String applyRule(char ch1, char ch2) {
        if(ch1 == 'A' && ch2 == 'B')
            return "A";
        if(ch1 == 'B' && ch2 == 'A')
            return "A";
        if(ch1 == 'C' && ch2 == 'B')
            return "C";
        if(ch1 == 'B' && ch2 == 'C')
            return "C";
        if(ch1 == 'A' && ch2 == 'A')
            return "A";
        if(ch1 == 'C' && ch2 == 'C')
            return "C";
        return null;
    }
}
