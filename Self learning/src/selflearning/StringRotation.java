package selflearning;

public class StringRotation {
	boolean isRotatedString(String s1, String s2) {
		return ((s1.length() == s2.length()) && (s1 + s1).indexOf(s2) != -1);
	}
}
