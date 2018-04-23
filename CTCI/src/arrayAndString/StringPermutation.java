package arrayandstring;

public class StringPermutation {
	public static void main(String[] args) {
		isPermutation("dog","odg");
	}
	
	static boolean isPermutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		return sort(s).equals(sort(t));
	}
	
	public static String sort(String str) {
		char[] temp = str.toCharArray();
		java.util.Arrays.sort(temp);
		return new String(temp);
	}
}
